package gameSalesManagement.Entities;


public class Campaign {
	
	int CampaignId;
	String name;
	String details;
	double rateOfDiscount;
	boolean isValid;

	public Campaign() {
		
	}
	
	public Campaign(int campaignId, String name, String details, double rateOfDiscount, boolean isValid) {
		super();
		CampaignId = campaignId;
		this.name = name;
		this.details = details;
		this.rateOfDiscount = rateOfDiscount;
		this.isValid = isValid;
	}

	public int getCampaignId() {
		return CampaignId;
	}

	public void setCampaignId(int campaignId) {
		CampaignId = campaignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getRateOfDiscount() {
		return rateOfDiscount;
	}

	public void setRateOfDiscount(double rateOfDiscount) {
		this.rateOfDiscount = rateOfDiscount;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
