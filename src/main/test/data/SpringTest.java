package data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cp.dao.ChaikDAO;
import com.cp.entity.Chaik;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest extends AbstractJUnit4SpringContextTests  {
	
	@Autowired
	private ChaikDAO chaikDAO;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Test
	public void testC(){
		Map<String, String> type = getDataType("gdklsf");
		for(String key : type.keySet()){
			System.out.println(key+"---->"+type.get(key));
		}
	}
	
	private Map<String, String> getDataType(String tableName){
        String sql = "select column_name,column_comment,data_type from information_schema.columns where table_name = '" + tableName.toLowerCase() +"'";
        System.out.println(sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        Map<String, String> result = new HashMap<String, String>();
        for (Map<String, Object> m : list) {
            result.put(m.get("column_name").toString(), m.get("data_type").toString());
        }
        return result;
    }
	@Test
	public void testA(){
		try {
			Chaik findOne = chaikDAO.findOne(2055);
			System.out.println(findOne.getSt1());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void testB(){
		try {
			
			Chaik findOne = new Chaik();
			findOne.setSt1("11111");
			findOne.setNd2("11111");
			findOne.setRd3("11111");
			findOne.setSt1("11111");
			findOne.setTh4("11111");
			findOne.setTh5("11111");
			findOne.setTh6("11111");
			findOne.setTh7("11111");
			chaikDAO.save(findOne);
			System.out.println(findOne.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
