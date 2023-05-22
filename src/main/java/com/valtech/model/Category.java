package com.valtech.model;

public class Category {
	
	private int Cid;
	private String Cname;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(int cid, String cname) {
		super();
		Cid = cid;
		Cname = cname;
	}


	public int getCid() {
		return Cid;
	}


	public void setCid(int cid) {
		Cid = cid;
	}


	public String getCname() {
		return Cname;
	}


	public void setCname(String cname) {
		Cname = cname;
	}


	@Override
	public String toString() {
		return "Category [Cid=" + Cid + ", Cname=" + Cname + "]";
	}
	
	

}
