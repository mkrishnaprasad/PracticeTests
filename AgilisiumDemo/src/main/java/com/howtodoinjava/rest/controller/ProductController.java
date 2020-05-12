package com.howtodoinjava.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.rest.dao.ProductDAO;
import com.howtodoinjava.rest.model.Products;

@RestController
@RequestMapping(path = "/products/api")
public class ProductController 
{
    @Autowired
    private ProductDAO productDAO;
    
    @GetMapping(path="/getProductDetails", produces = "application/json")
    public Products getProductDetails() 
    {
        return productDAO.getAllProducts();
    }
    
    @GetMapping(path="/getConfigDetails", produces = "application/json")
    public ResponseEntity<String> getConfigDetails() 
    {
        return  new ResponseEntity<>(productDAO.getConfigDetails(),HttpStatus.OK) ;
    }
    
}
