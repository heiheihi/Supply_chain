package com.fhhpojo;

import java.util.Date;

public class Commodity_details {

	
	private int d_id;
	private Commodity commodity;
	private int w_id;
	private String weight;
	private String volume;
	private Date date_of_production;
	private String bar_code;
	private Date inventory_time;
	private int t_id;
	private String cangku;
	
	public String getCangku() {
		return cangku;
	}
	public void setCangku(String cangku) {
		this.cangku = cangku;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public Date getDate_of_production() {
		return date_of_production;
	}
	public void setDate_of_production(Date date_of_production) {
		this.date_of_production = date_of_production;
	}
	public String getBar_code() {
		return bar_code;
	}
	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}
	public Date getInventory_time() {
		return inventory_time;
	}
	public void setInventory_time(Date inventory_time) {
		this.inventory_time = inventory_time;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	
	
}
