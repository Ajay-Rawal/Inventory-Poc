package com.valtech.vm;

public class CategoryVm {
	private int Cid;
	private String Cname;
	
	
	public CategoryVm() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CategoryVm(int cid, String cname) {
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
