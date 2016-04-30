package com.cp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDAO<T> extends JpaRepository<T, Serializable>{
	public List<T> queryListHql(String hql);
	
	public List<T> queryListBySql(String sql);
	
	public T findBySql(String sql);
	
	public T findByHql(String hql);
	
	public Integer getcountBySql(String sql,Map<String, Object> params);
	
	public Integer getcountByHql(String hql);
	
	public List<T> queryPageBySql(String sql,int pageIndex,int pageSize,Map<String, Object> params);
	
	public List<T> queryPageByHql(String sql,int pageIndex,int pageSize); 
	
	public Integer updateSql(String sql);
	
	public Integer updateHql(String hql);
}
