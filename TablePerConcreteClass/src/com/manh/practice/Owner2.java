package com.manh.practice;

public class Owner2 extends Person3{

Long partnership_stake;
Long stocks;

public Long getPartnership_stake() {
	return partnership_stake;
}
public void setPartnership_stake(Long partnership_stake) {
	this.partnership_stake = partnership_stake;
}
public Long getStocks() {
	return stocks;
}
public void setStocks(Long stocks) {
	this.stocks = stocks;
}
public Owner2(String firstName,String lastName,Long stocks,Long partnershipStake)
{
	super(firstName,lastName);
	this.stocks=stocks;
	this.partnership_stake=partnershipStake;
}

}
