package gameSalesManagement.Entities;

import java.time.LocalDate;

public class Sale {
	private int saleId;
	private double TotalPrice;
	private LocalDate saleDate;
	private String gameSaled; //bunları String tutmak daha mı iyi??
	private String buyerGamer;
	private String appliedCampaignName;
	
	public Sale() {
		
	}
	
	public Sale(int saleId, double totalPrice, LocalDate saleDate, String gameSaled, String buyerGamer,
			String appliedCampaignName) {
		super();
		this.saleId = saleId;
		TotalPrice = totalPrice;
		this.saleDate = saleDate;
		this.gameSaled = gameSaled;
		this.buyerGamer = buyerGamer;
		this.appliedCampaignName = appliedCampaignName;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public double getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public String getGameSaled() {
		return gameSaled;
	}

	public void setGameSaled(String gameSaled) {
		this.gameSaled = gameSaled;
	}

	public String getBuyerGamer() {
		return buyerGamer;
	}

	public void setBuyerGamer(String buyerGamer) {
		this.buyerGamer = buyerGamer;
	}

	public String getAppliedCampaignName() {
		return appliedCampaignName;
	}

	public void setAppliedCampaignName(String appliedCampaignName) {
		this.appliedCampaignName = appliedCampaignName;
	}


	
	}
