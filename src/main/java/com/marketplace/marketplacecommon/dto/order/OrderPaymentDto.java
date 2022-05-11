package com.marketplace.marketplacecommon.dto.order;

public class OrderPaymentDto {

	private String payment;
	private Double paymentValue;
	private Long ticketNumber;
	private String creationTime;
	private Integer numberInstallments;
	private String transactionId;
	private Integer ecommerceCardBrandId;
	private String dateCaptured;
	private Double totalPaymentValue;
	private Integer numberOrdersTransaction;
	private String paymentGateway;
	private Long ecommerceCardId;

	public OrderPaymentDto() {
		// Empty
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Double getPaymentValue() {
		return paymentValue;
	}

	public void setPaymentValue(Double paymentValue) {
		this.paymentValue = paymentValue;
	}

	public Long getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Long ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public Integer getNumberInstallments() {
		return numberInstallments;
	}

	public void setNumberInstallments(Integer numberInstallments) {
		this.numberInstallments = numberInstallments;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getEcommerceCardBrandId() {
		return ecommerceCardBrandId;
	}

	public void setEcommerceCardBrandId(Integer ecommerceCardBrandId) {
		this.ecommerceCardBrandId = ecommerceCardBrandId;
	}

	public String getDateCaptured() {
		return dateCaptured;
	}

	public void setDateCaptured(String dateCaptured) {
		this.dateCaptured = dateCaptured;
	}

	public Double getTotalPaymentValue() {
		return totalPaymentValue;
	}

	public void setTotalPaymentValue(Double totalPaymentValue) {
		this.totalPaymentValue = totalPaymentValue;
	}

	public Integer getNumberOrdersTransaction() {
		return numberOrdersTransaction;
	}

	public void setNumberOrdersTransaction(Integer numberOrdersTransaction) {
		this.numberOrdersTransaction = numberOrdersTransaction;
	}

	public String getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public Long getEcommerceCardId() {
		return ecommerceCardId;
	}

	public void setEcommerceCardId(Long ecommerceCardId) {
		this.ecommerceCardId = ecommerceCardId;
	}
}
