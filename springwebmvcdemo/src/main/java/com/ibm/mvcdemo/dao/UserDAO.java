package com.ibm.mvcdemo.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.ibm.mvcdemo.entity.User;

@Repository
public class UserDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	ArrayList<User> ulist = new ArrayList<>();
	public UserDAO() {
		ulist.add(new User("Souvik Pal", "spal62588"));
		ulist.add(new User("Tina", "tina62588"));
	}
		
	public boolean findUser(User user) {
		return 	ulist.contains(user);
		/*String qry = "select count(*) from users where username=? and password=?";
		int count = jdbcTemplate.queryForObject(qry, new String[] {user.getUsername(), user.getPassword()}, Integer.class);
		return count > 0;*/
	}
}
