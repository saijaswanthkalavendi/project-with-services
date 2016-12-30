package com.niit.services;

import java.util.List;

import com.niit.model.UserDetails;

public interface UserDetailsService {
	public List<UserDetails> list();
	public UserDetails get(int id);
	public void saveOrupdate(UserDetails userDetails);
	public void save(UserDetails userDetails);
	public void update(UserDetails userDetails);
	public void delete(int id);
}
