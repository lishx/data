package com.cp.service;

import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;



@Service
public class SaveDataServiceImpl implements SaveDataService {
	private static Log log = LogFactory.getLog(SaveDataServiceImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//private Map<String, String> dataTypeMap;
	
	@Override
	public void batchSaveData(List<Map<String, Object>> dataList, String tableName) {
			//dataTypeMap = getDataType(tableName);
	        String sql = "insert into " + tableName;
	      
	        Map<String, Object> sqlMap = parseMap(dataList.get(0));
	        sql += sqlMap.get("column").toString();
	        sql +=" select ";
	        sql += sqlMap.get("temp").toString();
	        sql +=" from DUAL where NOT EXISTS ( SELECT 1 FROM ";
	        sql +=tableName;
	        sql +=" WHERE expect = ? )";

	        //执行批量入库
	        List<Object[]> values = new ArrayList<Object[]>();
	        for (Map<String, Object> map : dataList) {
	            values.add(new Object[]{map.get("expect")});
	        }
	      
	        try{
	            jdbcTemplate.batchUpdate(sql, values, new int[]{12});
	            log.info("执行SQL："+ sql);
	        }catch(Exception e){
	        	e.printStackTrace();
	        	log.error("数据入库失败",e);
	        }
	}
	
	/**
	 * 根据表名查询字段名和字段类型
	 * @param tableName 表名
	 * @return
	 */
	@SuppressWarnings("unused")
	private Map<String, String> getDataType(String tableName){
        String sql = "select column_name,column_comment,data_type from information_schema.columns where table_name = '" + tableName.toLowerCase() +"'";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        Map<String, String> result = new HashMap<String, String>();
        for (Map<String, Object> m : list) {
            result.put(m.get("column_name").toString().toLowerCase(), m.get("data_type").toString());
        }
        return result;
    }


    /**
     * 参数转换
     * @param map
     * @return
     */
    private Map<String, Object> parseMap(Map<String, Object> map){
        StringBuffer column = new StringBuffer(" (") ;
        StringBuffer temp = new StringBuffer();
        for (String key : map.keySet()) {
            column.append(key).append(",");
            Object o = map.get(key);
            if(o instanceof String){
            	temp.append("'").append(o.toString()).append("'").append(",");
            }else{
            	temp.append(map.get(key)).append(",");
            }
        }
        column.setLength(column.length()-1);
      //  column.substring(0, column.length() - 1);
        column.append(" )");
        temp.setLength(temp.length()-1);
       // temp.substring(0, temp.length() - 1);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("column", column.toString());
        result.put("temp", temp.toString());
       
        return result;
    }
    
    /**
     * 根据字段名获取标准类型int
     * @param key 字段名
     * @return
     */
    @SuppressWarnings("unused")
	private int getDataTypeByKey(String key) {
      //  key = dataTypeMap.get(key.toLowerCase());
        if (key ==null || key.equals(""))  return -99;
        key = key.toLowerCase();
        if (key.equals("varchar2") || key.equals("varchar")) return Types.VARCHAR;
        if (key.equals("bigint")) return Types.BIGINT;
        if (key.equals("number")||key.equals("int")) return Types.INTEGER;
        if (key.equals("float")) return Types.FLOAT;
        if (key.equals("timestamp")) return Types.TIMESTAMP;
        return -99;
    }
}
