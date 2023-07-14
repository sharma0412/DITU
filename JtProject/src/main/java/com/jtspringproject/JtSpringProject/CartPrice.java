package com.jtspringproject.JtSpringProject;

public class CartPrice {


    String price;
    String cartDetail;

    public CartPrice(String price, String cartDetail){
        this.price=price;
        this.cartDetail=cartDetail;
    }


    public String getPrice(){
        return price;
    }

    public String getCartDetail() {
        return cartDetail;
    }
}
