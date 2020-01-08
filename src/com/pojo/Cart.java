package com.pojo;

public class Cart {
	private int pid;
	private String pimgPath;
	private String pName;
	private double pPrice;
	private int pCount;
	private double pTotal;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPimgPath() {
		return pimgPath;
	}
	public void setPimgPath(String pimgPath) {
		this.pimgPath = pimgPath;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpCount() {
		return pCount;
	}
	public void setpCount(int pCount) {
		this.pCount = pCount;
	}
	public double getpTotal() {
		return pTotal;
	}
	public void setpTotal(double pTotal) {
		this.pTotal = pTotal;
	}
	@Override
	public String toString() {
		return "Cart [pid=" + pid + ", pimgPath=" + pimgPath + ", pName=" + pName + ", pPrice=" + pPrice + ", pCount="
				+ pCount + ", pTotal=" + pTotal + "]";
	}
	
}
