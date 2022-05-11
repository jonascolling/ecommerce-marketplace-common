package com.marketplace.marketplacecommon.dto.order;

public class OrderCancelDto {

	private String dateUpdated;
	private String reasonCode;
	private String ecommerceConsignmentCode;

	public OrderCancelDto() {
		// Empty
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getEcommerceConsignmentCode() {
		return ecommerceConsignmentCode;
	}

	public void setEcommerceConsignmentCode(String ecommerceConsignmentCode) {
		this.ecommerceConsignmentCode = ecommerceConsignmentCode;
	}
}
