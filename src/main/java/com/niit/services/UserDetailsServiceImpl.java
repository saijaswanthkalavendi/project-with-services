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

import com.niit.dao.UserDetailsDAO;
import com.niit.model.UserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDAO dao;
	
	
	@Transactional
	public List<UserDetails> list() {
		return dao.list();
	}

	@Transactional
	public void save(UserDetails userDetails) {
		dao.save(userDetails);
	}
	
	@Transactional
	public void delete(int id) {
		dao.delete(id);
	}

	
	@Transactional
	public void saveOrupdate(UserDetails userDetails)
	{
		dao.saveOrupdate(userDetails);
	}
	
	@Transactional
	public UserDetails get(int id) {
		return dao.get(id);
	}
	
	@Transactional
	public void update(UserDetails userDetails)
	{
		
		dao.update(userDetails);
	}

}
