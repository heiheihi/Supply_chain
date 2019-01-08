package com.fhhpojo;

import java.util.Date;

public class Stock {

	 private int k_id;                      //库存id
	 private int Inventory_ceiling;         //商品上限
	 private int lower_limit;               //商品下限
	 private int number;                    //数量
	 private Commodity_details details;     //商品详情关联
	 private double price;                  //价格
	 private Date recent_Inventory_Time;    //最近时间
	 private int per_id;                    //人员关联
	 private int w_id;                      //仓库关联
	public int getK_id() {
		return k_id;
	}
	public void setK_id(int k_id) {
		this.k_id = k_id;
	}
	public int getInventory_ceiling() {
		return Inventory_ceiling;
	}
	public void setInventory_ceiling(int inventory_ceiling) {
		Inventory_ceiling = inventory_ceiling;
	}
	public int getLower_limit() {
		return lower_limit;
	}
	public void setLower_limit(int lower_limit) {
		this.lower_limit = lower_limit;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Commodity_details getDetails() {
		return details;
	}
	public void setDetails(Commodity_details details) {
		this.details = details;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getRecent_Inventory_Time() {
		return recent_Inventory_Time;
	}
	public void setRecent_Inventory_Time(Date recent_Inventory_Time) {
		this.recent_Inventory_Time = recent_Inventory_Time;
	}
	public int getPer_id() {
		return per_id;
	}
	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	 
}
