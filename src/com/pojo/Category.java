package com.pojo;

import java.util.List;

public class Category {
	private String cname;
	private int cid;
	private List<CategorySecond> csList;
	@Override
	public String toString() {
		return "Category [cname=" + cname + ", cid=" + cid + ", csList=" + csList + "]";
	}
	public List<CategorySecond> getCsList() {
		return csList;
	}
	public void setCsList(List<CategorySecond> csList) {
		this.csList = csList;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
}
