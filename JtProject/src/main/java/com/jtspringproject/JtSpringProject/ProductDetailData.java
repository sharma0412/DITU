package com.jtspringproject.JtSpringProject;

public class ProductDetailData {


    String price;
    String cartDetail;
    String ProductDetail;
    String productPriceDetail;

    public ProductDetailData(String price, String cartDetail){
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
