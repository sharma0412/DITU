package com.jtspringproject.JtSpringProject.services;

import com.jtspringproject.JtSpringProject.dao.cartDao;
import com.jtspringproject.JtSpringProject.models.Cart;
import com.jtspringproject.JtSpringProject.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartService {
    @Autowired
    private cartDao cartDao;

    public Cart addCart(Cart cart)
    {
        return cartDao.addCart(cart);
    }
//    public Cart getCart(int id)
//    {
//        return cartDao.getCart(id);
//    }
public List<Cart> getCarts(){
    return this.cartDao.getCarts();
}

    public void updateCart(Cart cart){
        cartDao.updateCart(cart);
    }
    public void deleteCart(Cart cart)
    {
        cartDao.deleteCart(cart);
    }

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
for (String name : names) {
        System.out.println(name);
    }
    int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
        System.out.println(num);
    }
    int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
        System.out.println(num);
    }
}


