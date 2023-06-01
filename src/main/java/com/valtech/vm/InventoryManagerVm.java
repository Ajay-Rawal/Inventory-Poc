package com.valtech.vm;

public class InventoryManagerVm {
	
	private int IMid;
	private String IMname;
	private String IMemail;
	private String IMphone;
	public InventoryManagerVm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InventoryManagerVm(int iMid, String iMname, String iMemail, String iMphone) {
		super();
		this.IMid = iMid;
		this.IMname = iMname;
		this.IMemail = iMemail;
		this.IMphone = iMphone;
	}
	public int getIMid() {
		return IMid;
	}
	public void setIMid(int iMid) {
		IMid = iMid;
	}
	public String getIMname() {
		return IMname;
	}
	public void setIMname(String iMname) {
		IMname = iMname;
	}
	public String getIMemail() {
		return IMemail;
	}
	public void setIMemail(String iMemail) {
		IMemail = iMemail;
	}
	public String getIMphone() {
		return IMphone;
	}
	public void setIMphone(String iMphone) {
		IMphone = iMphone;
	}
	
	@Override
	public String toString() {
		return "InventoryManager [IMid=" + IMid + ", IMname=" + IMname + ", IMemail=" + IMemail + ", IMphone=" + IMphone
				+ "]";
	}

}
