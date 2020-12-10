package com.yash.storemanagementsystem.model;

/*
 * It it the model class for product quality module
 * contains data member and respective getter setters.
 */
public class ProductQuality {
	/*
	 * Id of the product quality
	 */
	private int id;
	

	/*
	 * name of the product quality
	 */
	private String name;
	

	/*
	 * descripton of the product quality
	 */
	private String description;
	

	/*
	 * default constructor for creating instance only.
	 */
	public ProductQuality() {
	}


	/*
	 * Construct for instantiation of Product object with all fields;
	 */
	public ProductQuality(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/*
	 * getter method for getting product quality id
	 */
	public int getId() {
		return id;
	}

	/*
	 * setter method for setting product quality id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * getter method for getting product quality name
	 */
	public String getName() {
		return name;
	}

	/*
	 * setter method for setting product quality name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * getter method for getting product quality description
	 */
	public String getDescription() {
		return description;
	}

	/*
	 * setter method for setting product quality description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * toString method for return all data of a particular product qualities object(in SOP)
	 */
	@Override
	public String toString() {
		return "ProductQuality [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	
}
