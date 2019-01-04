package com.fhhpojo;

import java.util.Date;

public class Inventory {

	private int i_id;  
	private int per_id;
	private Date time;
	private int w_id;
	private String remarks;
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public int getPer_id() {
		return per_id;
	}
	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
