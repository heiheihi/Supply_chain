package com.fhhpojo;

import java.util.Date;

public class Outgoing_and_warehousing {

	private int o_id;
	private Date o_date;
	private int p_id;
	private int o_state;
	private String o_reason;
	private int w_id;
	private double price;
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getO_state() {
		return o_state;
	}
	public void setO_state(int o_state) {
		this.o_state = o_state;
	}
	public String getO_reason() {
		return o_reason;
	}
	public void setO_reason(String o_reason) {
		this.o_reason = o_reason;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
