package com.cp.service;


import java.util.List;
import java.util.Map;


public interface SaveDataService {
	/**
	 * 
	 * @param dataList 要入库的数据源
	 * @param tableName  入库的表名
	 */
    public void batchSaveData(List<Map<String, Object>> dataList, String tableName);
}
