package com.jtspringproject.JtSpringProject.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jtspringproject.JtSpringProject.models.Product;

@Repository
public class productDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Product> getProducts() {
		return this.sessionFactory.getCurrentSession().createQuery("from PRODUCT").list();
	}


	@Transactional
	public Product addProduct(Product product) {
		this.sessionFactory.getCurrentSession().save(product);
		return product;
	}

	@Transactional
	public Product getProduct(int id) {
		return this.sessionFactory.getCurrentSession().get(Product.class, id);
	}

	public Product updateProduct(Product product) {
		this.sessionFactory.getCurrentSession().update(String.valueOf(Product.class), product);
		return product;
	}

	@Transactional
	public Boolean deleteProduct(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Object persistenceInstance = session.load(Product.class, id);

		if (persistenceInstance != null) {
			session.delete(persistenceInstance);
			return true;
		}
		return false;
	}
}













