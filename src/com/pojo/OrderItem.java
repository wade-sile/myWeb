package com.pojo;

public class OrderItem {
	private int oiid;
	private int count;
	private double subtotal;
	private int pid;
	private int oid;
	private String pname;
	private String pimgpath;
	private double price;
	@Override
	public String toString() {
		return "OrderItem [oiid=" + oiid + ", count=" + count + ", subtotal=" + subtotal + ", pid=" + pid + ", oid="
				+ oid + ", pname=" + pname + ", pimgpath=" + pimgpath + ", price=" + price + "]";
	}
	public int getOiid() {
		return oiid;
	}
	public void setOiid(int oiid) {
		this.oiid = oiid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPimgpath() {
		return pimgpath;
	}
	public void setPimgpath(String pimgpath) {
		this.pimgpath = pimgpath;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
