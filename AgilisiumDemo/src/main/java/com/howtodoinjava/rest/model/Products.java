package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Products 
{
    private List<Product> productList;
    
    public List<Product> getProductList() {
        if(productList == null) {
        	productList = new ArrayList<>();
        }
        return productList;
    }
 
    public void setProducteList(List<Product> productList) {
        this.productList = productList;
    }
}
