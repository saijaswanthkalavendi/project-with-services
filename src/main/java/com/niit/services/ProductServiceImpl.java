package com.niit.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Service
public class ProductServiceImpl implements ProductService  {
	
	@Autowired
	ProductDao dao;
	
		@Transactional
	public List<Product> list() {
		return dao.list();
	}

	@Transactional
	public Product get(int id) {
		return dao.get(id);
	}

	@Transactional
	public void saveOrUpdate(Product product) {
		dao.saveOrUpdate(product);
	}

	@Transactional
	public void delete(int id) {
		dao.delete(id);
	}

	@Transactional
	public List getAllProducts() {
		return dao.getAllProducts();
	}

	@Transactional
	public Product getSingleProduct(int id) {
		return dao.getSingleProduct(id);
	}

	@Transactional
	public int updateProduct(Product product) {
		return dao.updateProduct(product);
	}

}
