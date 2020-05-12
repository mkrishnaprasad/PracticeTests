package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Product;
import com.howtodoinjava.rest.model.Products;

@Repository
public class ProductDAO 
{
    private static Products list = new Products();
    
    static 
    {
        list.getProductList().add(new Product(1, "fridge", "double door fridge"));
        list.getProductList().add(new Product(2, "coocker", "with 5 years warrany"));
        list.getProductList().add(new Product(3, "cooler", "branded"));
    }
    
    public Products getAllProducts() 
    {
        return list;
    }
    
    public void addProduct(Product product) {
        list.getProductList().add(product);
    }
    
    public String getConfigDetails() {
    	
    	return "user name and password required.";
    }
}
