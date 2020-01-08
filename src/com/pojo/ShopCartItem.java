package com.pojo;

public class ShopCartItem {
	private int cartitemid;
	private int uid;
	private int pid;
	private int pcount;
	private double price;
	private String image;
	private double ptotal;
	private String pname;
	private Orders oid;
	
	public Orders getOid() {
		return oid;
	}
	public void setOid(Orders oid) {
		this.oid = oid;
	}
	public int getCartitemid() {
		return cartitemid;
	}
	public void setCartitemid(int cartitemid) {
		this.cartitemid = cartitemid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPtotal() {
		return ptotal;
	}
	public void setPtotal(double ptotal) {
		this.ptotal = ptotal;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "ShopCartItem [cartitemid=" + cartitemid + ", uid=" + uid + ", pid=" + pid + ", pcount=" + pcount
				+ ", price=" + price + ", image=" + image + ", ptotal=" + ptotal + ", pname=" + pname + ", oid=" + oid
				+ "]";
	}
}
