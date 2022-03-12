package com.persistent.dao;

import java.util.HashMap;
import java.util.Map;

import com.persistent.user.User;

public class UserDAOImp implements UserDAO{
	
	Map<Integer, User> map = new HashMap<Integer, User>();
	public void create(User u) {
		map.put(u.getUid(), u);
	}

	public User read(int id) {
		return map.get(id);
	}
	
}
