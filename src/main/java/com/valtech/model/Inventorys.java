package com.valtech.model;

public class Inventorys {
	
	private int inventory_id;
	private int Wid;
	private int product_id;
	public Inventorys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventorys(int inventory_id, int wid, int product_id) {
		super();
		this.inventory_id = inventory_id;
		this.Wid = wid;
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
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	
	@Override
	public String toString() {
		return "Inventorys [inventory_id=" + inventory_id + ", Wid=" + Wid + ", product_id=" + product_id + "]";
	}
	
	

}
