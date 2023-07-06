package com.jtspringproject.JtSpringProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jtspringproject.JtSpringProject.models.Category;
import com.jtspringproject.JtSpringProject.models.Product;

@Repository
public class productDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
	
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

	public Product updateProduct(Product product){
		this.sessionFactory.getCurrentSession().update(String.valueOf(Product.class),product);
		return product;
	}
	@Transactional
	public Boolean deletProduct(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Object persistanceInstance = session.load(Product.class, id);

		if (persistanceInstance != null) {
			session.delete(persistanceInstance);
			return true;
		}
		return false;
	}

}

	// Declaring an array
	int[] numbers;

// Initializing an array with values
numbers = new int[]{1, 2, 3, 4, 5};

// Accessing elements in the array
		int firstNumber = numbers[0]; // Accessing the first element (1)
		int secondNumber = numbers[1]; // Accessing the second element (2)
		int thirdNumber = numbers[2]; // Accessing the third element (3)

// Modifying elements in the array
		numbers[3] = 10; // Changing the value of the fourth element to 10

// Finding the length of the array
		int length = numbers.length; // length variable will be 5

// Iterating over the array
		for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
		}
		// Declaring an array
		int[] numbers;

// Initializing an array with values
		numbers = new int[]{1, 2, 3, 4, 5};

// Accessing elements in the array
		int firstNumber = numbers[0]; // Accessing the first element (1)
		int secondNumber = numbers[1]; // Accessing the second element (2)
		int thirdNumber = numbers[2]; // Accessing the third element (3)

// Modifying elements in the array
		numbers[3] = 10; // Changing the value of the fourth element to 10

// Finding the length of the array
		int length = numbers.length; // length variable will be 5

// Iterating over the array
		for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
		}
		int age;
		double salary;
		String name;
		boolean isMarried;

public class TrianglePattern {
	public static void main(String[] args) {
		int numRows = 5; // Number of rows in the triangle

		for (int i = 1; i <= numRows; i++) {
			// Print spaces before the asterisks
			for (int j = 1; j <= numRows - i; j++) {
				System.out.print(" ");
			}

			// Print asterisks for the current row
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			// Move to the next line
			System.out.println();
		}
	}
}








