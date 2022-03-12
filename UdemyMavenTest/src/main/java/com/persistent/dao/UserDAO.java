package com.persistent.dao;

import com.persistent.user.User;

public interface UserDAO {
	public void create(User u);
	public User read(int id);
}
