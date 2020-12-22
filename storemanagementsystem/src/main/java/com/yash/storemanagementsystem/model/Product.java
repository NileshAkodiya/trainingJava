package com.yash.storemanagementsystem.model;
/*
 * It is the model class for product module
 * contains data member and respective getter setters.
 */
public class Product {
	/*
	 * Id of the product
	 */
	private int id;
	
	/*
	 *  Customer Id related to product
	 */
	private int productCustomerId;
	
	/*
	 * Product name
	 */
	private String name;
	
	/*
	 *  Product's Price
	 */
	private double price;
	
	/*
	 * Product description
	 */
	private String description;
	
	/*
	 * default constructor for creating instance only.
	 */
	public Product() {
	}
	/*
	 * Construct for instantiation of Product object with all fields;
	 */
	public Product(int id, int productCustomerId, String name, double price, String description) {
		this.id = id;
		this.productCustomerId = productCustomerId;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	/*
	 * Construct for instantiation of Product object with two fields(id,price);
	 */
	public Product(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}
	
	/*
	 * Construct for instantiation of Product object with two fields(id,description);
	 */
	public Product(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	/*
	 * getter method for getting product id
	 */
	public int getId() {
		return id;
	}

	/*
	 * setter method for setting product id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * getter method for getting product name
	 */
	public String getName() {
		return name;
	}

	/*
	 * setter method for setting product name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * getter method for getting product price
	 */
	public double getPrice() {
		return price;
	}
	
	/*
	 * setter method for setting product price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	

	/*
	 * getter method for getting product description
	 */
	public String getDescription() {
		return description;
	}


	/*
	 * setter method for setting product description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/*
	 * getter method for getting product Customer id
	 */
	public int getProductCustomerId() {
		return productCustomerId;
	}


	/*
	 * setter method for setting product  customer id
	 */
	public void setProductCustomerId(int productCustomerId) {
		this.productCustomerId = productCustomerId;
	}


	/*
	 * toString method for return all data of a particular product's object(in SOP)
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", productCustomerId=" + productCustomerId + ", name=" + name + ", price=" + price
				+ ", description=" + description + "]";
	}

	
}
