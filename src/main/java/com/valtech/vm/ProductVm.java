package com.valtech.vm;

public class ProductVm {
	
	private int product_id;
	private String Product_name;
	private String description;
	private float price;
	private int Pquantity;
	private int Cid;
	private int userId;
	public ProductVm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

public ProductVm(int product_id, String product_name, String description, float price, int pquantity, int cid,
			int userId) {
		super();
		this.product_id = product_id;
		this.Product_name = product_name;
		this.description = description;
		this.price = price;
		this.Pquantity = pquantity;
		this.Cid = cid;
		this.userId = userId;
	}




	public int getUserId() {
	return userId;
}



public void setUserId(int userId) {
	this.userId = userId;
}



	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPquantity() {
		return Pquantity;
	}
	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public void setPquantity(int pquantity) {
		Pquantity = pquantity;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", Product_name=" + Product_name + ", description=" + description
				+ ", price=" + price + ", Pquantity=" + Pquantity + ", Cid=" + Cid + "]";
	}

}
