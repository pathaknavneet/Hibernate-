package com.manh.practice;

public class Bid {

	private Item item;
	private int id;
	private String bidder_name;
	private Long bid_price;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBidder_name() {
		return bidder_name;
	}

	public void setBidder_name(String bidder_name) {
		this.bidder_name = bidder_name;
	}

	public Long getBid_price() {
		return bid_price;
	}

	public void setBid_price(Long bid_price) {
		this.bid_price = bid_price;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
