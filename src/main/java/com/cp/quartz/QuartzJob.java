package com.cp.quartz;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import com.cp.service.SaveDataService;
import com.cp.util.HttpUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class QuartzJob {
	private static Logger log = Logger.getLogger(QuartzJob.class);
	
	@Autowired
	private SaveDataService saveDataService;
	private String code;
	
	private  static  String SHOWAPI_APPID="18455";
	private  static  String SHOWAPI_SIGN="d706853b91934747bbcc4d0ece67c364";
	private static Properties prop =null;
	private static String[] COLUMN_INDEXS = new String[]{
		"one","two","three","four","five","six","seven","eight"	
	};
	static {
		if (null == prop) {
			Resource resource = new ClassPathResource("data_url.properties");
			prop = new Properties();
			try {
				prop.load(resource.getInputStream());
				//
				String appid = prop.getProperty("SHOWAPI_APPID");
				if (!StringUtils.isEmpty(appid)) {
					SHOWAPI_APPID = appid;
				}
				String sign = prop.getProperty("SHOWAPI_SIGN");
				if (!StringUtils.isEmpty(sign)) {
					SHOWAPI_SIGN = sign;
				}

			} catch (IOException e) {
				log.error("加载数据采集配置文件失败", e);
			}
		}
	}
	//http://route.showapi.com/44-1最新开奖信息
	@SuppressWarnings("unchecked")
	public void work()
    {
		String newurl = prop.getProperty("NEW_URL");
		if(StringUtils.isEmpty(newurl)){
			throw new RuntimeException("获取最新开奖信息url失败");
		}
		Map<String, String> map = new HashMap<>();
		map.put("code", code);
		map.put("showapi_appid", SHOWAPI_APPID);
		map.put("showapi_sign", SHOWAPI_SIGN);
		try {
			String response = HttpUtils.URLPost(newurl, map);
			Gson gson = new Gson();
			Map<String, Object> fromJson = gson.fromJson(response,new TypeToken<Map<String, Object>>() {
			}.getType());
			System.out.println(response);
			//获取到有数据
			if(null != fromJson && !fromJson.isEmpty() ){
				//采集成功
				String res_code = fromJson.get("showapi_res_code").toString();
				if("0.0".equals(res_code)){
					Object resBody = fromJson.get("showapi_res_body");
					if(!StringUtils.isEmpty(resBody)){
						Map<String, Object> resBodyMap  = (Map<String, Object>)resBody;
						List<Map<String, Object>> results = (List<Map<String, Object>>) resBodyMap.get("result");
						Object openCode = null;
						Object timestamp= null;
						for(Map<String, Object> caip:results){
							 timestamp = caip.get("timestamp");
							if(null != timestamp){
								BigDecimal bd = new BigDecimal(timestamp.toString());
								caip.put("timestamp",bd.longValue());
							}
							
							
							openCode = caip.get("openCode");
							if(null != openCode){
								String[] strings = openCode.toString().split(",|\\+");
								for(int i = 0,len =strings.length;i<len && i < 8;i++){
									caip.put(COLUMN_INDEXS[i], strings[i]);
								}
							}
						}
						saveDataService.batchSaveData(results, code);
					}
					
				}else{
					throw new RuntimeException("采集未成功！/n errcode:"+res_code+"\t"+fromJson.get("showapi_res_error").toString());
				}
			}
			
		} catch (Exception e) {
			log.error("获取数据失败",e);
		}
		
		
		
    }

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		QuartzJob.prop = prop;
	}
	
	
}
