package com.valtech.model;

public class Warehouse {
	
	private int Wid;
	private String Wname;
	private String Waddress;
	private int product_id;
	private int inventory_id;
	private int userId;
	
	public Warehouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Warehouse(int wid, String wname, String waddress, int product_id, int inventory_id, int userId) {
		super();
		this.Wid = wid;
		this.Wname = wname;
		this.Waddress = waddress;
		this.product_id = product_id;
		this.inventory_id = inventory_id;
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



	public int getInventory_id() {
		return inventory_id;
	}



	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}



	public int getWid() {
		return Wid;
	}

	public void setWid(int wid) {
		Wid = wid;
	}

	public String getWname() {
		return Wname;
	}

	public void setWname(String wname) {
		Wname = wname;
	}

	public String getWaddress() {
		return Waddress;
	}

	public void setWaddress(String waddress) {
		Waddress = waddress;
	}



	@Override
	public String toString() {
		return "Warehouse [Wid=" + Wid + ", Wname=" + Wname + ", Waddress=" + Waddress + ", product_id=" + product_id
				+ ", inventory_id=" + inventory_id + ", userId=" + userId + "]";
	}
	

}
