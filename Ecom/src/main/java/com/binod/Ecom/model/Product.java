package com.binod.Ecom.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String category;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yy")
	private Date releaseDate;
	private boolean productAvailable;
	private int stockQuantity;
	public Product(int i) {
		
	}
public Product() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isProductAvailable() {
		return productAvailable;
	}
	public void setProductAvailable(boolean productAvailable) {
		this.productAvailable = productAvailable;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
				+ price + ", category=" + category + ", releaseDate=" + releaseDate + ", productAvailable="
				+ productAvailable + ", stockQuantity=" + stockQuantity + "]";
	}
	
	
}
