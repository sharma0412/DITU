package com.jtspringproject.JtSpringProject.services;

import com.jtspringproject.JtSpringProject.dao.categoryDao;
import com.jtspringproject.JtSpringProject.models.Category;
import com.jtspringproject.JtSpringProject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryServiceAdvancedNew {


	@Autowired
	private com.jtspringproject.JtSpringProject.dao.userDao userDao;

	public List<User> getUsers(){
		return this.userDao.getAllUser();
	}

	public User addUser(User user) {
		return this.userDao.saveUser(user);
	}

	public User checkLogin(String username,String password) {
		return this.userDao.getUser(username, password);
	}


	@Autowired
	private categoryDao categoryDao;
	
	public Category addCategory(String name) {
		return this.categoryDao.addCategory(name);
	}
	
	public List<Category> getCategories(){
		return this.categoryDao.getCategories();
	}
	
	public Boolean deleteCategory(int id) {
		return this.categoryDao.deletCategory(id);
	}
	
	public Category updateCategory(int id,String name) {
		return this.categoryDao.updateCategory(id, name);
	}

	public Category getCategory(int id) {
		return this.categoryDao.getCategory(id);
	}
}
