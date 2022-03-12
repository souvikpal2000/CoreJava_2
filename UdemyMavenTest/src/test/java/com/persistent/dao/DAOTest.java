package com.persistent.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.persistent.user.User;

public class DAOTest {
	User ob;
	UserDAO dao;
	@Before
	public void createObject() {
		ob = new User();
		dao = new UserDAOImp();
	}
	@After
	public void deleteObject() {
		ob = null;
		dao = null;
	}
	@Test
	public void testFunction() {
		ob.setUid(1);
		ob.setName("Souvik Pal");
		ob.setCompanyName("Persistent Systems");
		
		dao.create(ob);
		User u = dao.read(1);
		
		assertNotNull(u);
		assertEquals("Souvik Pal", u.getName());
	}
}
