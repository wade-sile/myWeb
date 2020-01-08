package com.pojo;

import java.util.Date;

public class Orders {
	private int oid;
	private double money;
	private int state;
	private String receiveInfo;
	private String phoNum;
	private Date order_time;
	private int uid;
	private String accepter;
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", money=" + money + ", state=" + state + ", receiveInfo=" + receiveInfo
				+ ", phoNum=" + phoNum + ", order_time=" + order_time + ", uid=" + uid + ", accepter=" + accepter + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getReceiveInfo() {
		return receiveInfo;
	}
	public void setReceiveInfo(String receiveInfo) {
		this.receiveInfo = receiveInfo;
	}
	public String getPhoNum() {
		return phoNum;
	}
	public void setPhoNum(String phoNum) {
		this.phoNum = phoNum;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAccepter() {
		return accepter;
	}
	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}
}
