package com.niit.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	SupplierDao dao;
	
	public List<Supplier> list1() 
	   {
	   return null;
	   }


	@Transactional
	public void saveOrUpdate(Supplier supplier) 
	{
			dao.saveOrUpdate(supplier);
	}

	@Transactional
	public void delete(int id)
	{
		dao.delete(id);
	}

	@Transactional
	public Supplier get(int id) 
	{
		return dao.get(id);
	}

	@Transactional
	public List getAllSuppliers()
	{
		return dao.getAllSuppliers();
	}

	@Transactional
	public Supplier getSingleSupplier(int id)
	{
		return dao.getSingleSupplier(id);
	}

	public List<Supplier> list() {
		return dao.list();

	}
	
	@Transactional
	public void save(Supplier supplier) {
		
		dao.save(supplier);
	}

	@Transactional
	public void update(Supplier supplier) {
 dao.update(supplier);
	}

}
