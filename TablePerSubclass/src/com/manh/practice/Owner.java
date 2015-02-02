package com.manh.practice;

public class Owner extends Person2 {

	private Long partnershipStake;
	private Long stocks;

	public Owner(String firstName, String lastName, Long stocks,
			Long partnershipStake) {
		super(firstName, lastName);
		this.stocks = stocks;
        this.partnershipStake=partnershipStake;
	}

	public Long getPartnershipStake() {
		return partnershipStake;
	}

	public void setPartnershipStake(Long partnershipStake) {
		this.partnershipStake = partnershipStake;
	}

	public Long getStocks() {
		return stocks;
	}

	public void setStocks(Long stocks) {
		this.stocks = stocks;
	}
	
	

}
