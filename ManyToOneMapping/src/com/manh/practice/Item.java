package com.manh.practice;

import java.util.HashSet;
import java.util.Set;

public class Item {
private int item_id;
private String name ;
private String type;
private Set<Bid> bids=new HashSet<Bid>();

public Set<Bid> getBids() {
	return bids;
}
public void setBids(Set<Bid> bids) {
	this.bids = bids;
}
public int getItem_id() {
	return item_id;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public void addBid(Bid bid)
{
   bids.add(bid);
   bid.setItem(this);
}
}
