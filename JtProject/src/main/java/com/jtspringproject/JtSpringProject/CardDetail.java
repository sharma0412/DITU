package com.jtspringproject.JtSpringProject;

public class CardDetail {


    String price;
    String cartDetail;

    public CardDetail(String price, String cartDetail){
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
