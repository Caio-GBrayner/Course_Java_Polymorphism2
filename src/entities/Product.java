package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
	protected String name;
	protected Double price;
	
	 List<Product> listProduct = new ArrayList<>();
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
        return String.format("%s $ %.2f", name, price);
    }
	
	public void addListProduct(Product listProducts) {
		listProduct.add(listProducts);
	}
	
	  public List<Product> getListProducts() {
	        return listProduct;
	    }

}
