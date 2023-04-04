package com.app.dao;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.beans.AssetBean;
import com.app.beans.EmployeeBean;
import com.app.entity.AssetEntity;
import com.app.entity.EmployeeEntity;
import com.app.utility.JPAUtility;


public class EmployeeDaoImpl implements EmployeeDao{
	
	public void insertEmployeeDetails(EmployeeBean employeeBean, AssetBean assetBean) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpId(employeeBean.getEmpId());
		employeeEntity.setName(employeeBean.getName());
		employeeEntity.setDesignation(employeeBean.getDesignation());
		AssetEntity assetEntity = new AssetEntity();
		assetEntity.setAssetId(assetBean.getAssetId());
		assetEntity.setAssetName(assetBean.getAssetName());
		assetEntity.setType(assetBean.getType());
		employeeEntity.setAsset(assetEntity);
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(assetEntity);
		entityManager.persist(employeeEntity);
		entityManager.getTransaction().commit();
	}
	/* public EmployeeBean findEmployeeById(int id) {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		//entityManager.getTransaction().begin();
		EmployeeEntity empEntity = entityManager.find(EmployeeEntity.class, id);
		//entityManager.getTransaction().commit();
		if(empEntity != null) {
		EmployeeBean empBean = new EmployeeBean();
		empBean.setEmpId(empEntity.getEmpId());
		empBean.setDesignation(empEntity.getDesignation());
		empBean.setName(empEntity.getName());
		return empBean;
		}
		else
			return null;
	}
	public void removeEmployee(int id) {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.find(EmployeeEntity.class,id));
		entityManager.getTransaction().commit();
	}
	public void updateEmployee(EmployeeBean empB) {
		int id = empB.getEmpId();
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		EmployeeEntity empE = entityManager.find(EmployeeEntity.class, id);
		if(empE != null) {
		entityManager.getTransaction().begin();
		empE.setName(empB.getName());
		empE.setDesignation(empB.getDesignation());
		entityManager.getTransaction().commit();
		}
	}
	
	
	public List<EmployeeBean> customQuery1(){
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		List<EmployeeEntity> entList;
		Query query = entityManager.createQuery("select k from EmployeeEntity k where k.name LIKE 'S%'");
		entList = query.getResultList();
		List<EmployeeBean> empBList = new ArrayList<EmployeeBean>();
		for(EmployeeEntity e : entList) {
			Object obj = e;
			EmployeeBean empB = new EmployeeBean();
			empB.setEmpId(e.getEmpId());
			empB.setName(e.getName());
			empB.setDesignation(e.getDesignation());
			empBList.add(empB);
		}
		return empBList;		
	}
	
	
	
	public List<EmployeeBean> customQuery2() {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createNamedQuery("getRangeData");
		query.setParameter(1, 100);
		query.setParameter(2, 1001);
		List<EmployeeEntity> employeeList = query.getResultList();
		List<EmployeeBean> employeeBList = new ArrayList<EmployeeBean>();
		for(EmployeeEntity empE: employeeList) {
			EmployeeBean empB = new EmployeeBean();
			empB.setEmpId(empE.getEmpId());
			empB.setName(empE.getName());
			empB.setDesignation(empE.getDesignation());
			employeeBList.add(empB);
		}
		return employeeBList;
	}
	public List<EmployeeBean> customQuery3() {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createNamedQuery("getNamesWithA");
		List<EmployeeEntity> employeeList = query.getResultList();
		List<EmployeeBean> employeeBList = new ArrayList<EmployeeBean>();
		for(EmployeeEntity empE: employeeList) {
			EmployeeBean empB = new EmployeeBean();
			empB.setEmpId(empE.getEmpId());
			empB.setName(empE.getName());
			empB.setDesignation(empE.getDesignation());
			employeeBList.add(empB);
		}
		return employeeBList;
	}
	public List<EmployeeBean> customQuery4() {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createNamedQuery("getNamesWithP");
		List<EmployeeEntity> employeeList = query.getResultList();
		List<EmployeeBean> employeeBList = new ArrayList<EmployeeBean>();
		for(EmployeeEntity empE: employeeList) {
			EmployeeBean empB = new EmployeeBean();
			empB.setEmpId(empE.getEmpId());
			empB.setName(empE.getName());
			empB.setDesignation(empE.getDesignation());
			employeeBList.add(empB);
		}
		return employeeBList;
	}*/

	
}
