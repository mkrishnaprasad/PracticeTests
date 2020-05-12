package com.howtodoinjava.rest.model;

public class Product {

	private Integer id;
    private String productName;
    private String productDescription;
    
    public Product() {

    }

    public Product(Integer id, String productName, String productDescription) {
        super();
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
    }
 
    

    

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
    public String toString() {
        return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription + "]";
    }
}
