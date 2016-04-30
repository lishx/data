package com.cp.dao.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.util.Assert;

import com.cp.dao.BaseDAO;


@NoRepositoryBean
@SuppressWarnings("unchecked")
public class BaseDAOImpl<T, Id extends Serializable> extends SimpleJpaRepository<T, Serializable>
		implements BaseDAO<T> {

	private final EntityManager em;
	private final Class<T> entityClass;
	
	
	
	public BaseDAOImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		Assert.notNull(entityInformation);
		Assert.notNull(entityManager);
		this.em = entityManager;
		entityClass = entityInformation.getJavaType();
	}

	public List<T> queryListHql(String sql) {
		return em.createQuery(sql, entityClass).getResultList();
	}

	public List<T> queryListBySql(String sql) {
		return em.createNativeQuery(sql, entityClass).getResultList();
	}

	@Override
	public T findBySql(String sql) {
		@SuppressWarnings("rawtypes")
		List resultList = em.createNativeQuery(sql, entityClass).getResultList();
		if(null != resultList && !resultList.isEmpty()){
			return (T)resultList.get(0);
		}else{
			return null;
		}
	}

	@Override
	public T findByHql(String hql) {
		return em.createQuery(hql, entityClass).getSingleResult();
	}

	@Override
	public Integer getcountBySql(String sql,Map<String, Object> params) {
		 Query query = em.createNativeQuery("select count(1) from ("+ sql+") a");
		 for(String key : params.keySet()){
			 query.setParameter(key, params.get(key));
		 }
		 
		return ((BigInteger)
				query.getSingleResult()).intValue();
	}

	@Override
	public Integer getcountByHql(String hql) {
		return ((BigDecimal) em.createQuery(hql).getSingleResult()).intValue();
	}

	@Override
	public List<T> queryPageBySql(String sql, int pageIndex, int pageSize,Map<String, Object> params) {
		Query query = em.createNativeQuery(sql, entityClass);
		for(String key : params.keySet()){
			 query.setParameter(key, params.get(key));
		 }
		return query.setFirstResult(pageIndex)
		.setMaxResults(pageSize).getResultList();
	}

	@Override
	public List<T> queryPageByHql(String sql, int pageIndex, int pageSize) {
		return  em.createQuery(sql, entityClass).setFirstResult(pageIndex).setMaxResults(pageSize)
		.getResultList();
	}

	@Override
	public Integer updateSql(String sql) {
		return em.createNativeQuery(sql).executeUpdate();
	}

	@Override
	public Integer updateHql(String hql) {
		
		return em.createQuery(hql,entityClass).executeUpdate();
	}
	
	
}
