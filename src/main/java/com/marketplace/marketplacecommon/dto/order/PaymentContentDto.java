package com.marketplace.marketplacecommon.dto.order;

import java.util.List;

public class PaymentContentDto {

    private Double cardTotalValue;
    private Integer numberInstallments;
    private String transactionId;
    private Double commissionTotalValue;
    private List<PaymentInstallmentDto> installments;
    private Integer ecommerceCardBrandId;
    private String dateCaptured;
    private Double totalCaptured;
    private Integer numberOrdersTransaction;
    private String payment;
    private String ecommerceAuthorization;
    private Long ticketNumber;

    public Double getCardTotalValue() {
        return cardTotalValue;
    }

    public void setCardTotalValue(Double cardTotalValue) {
        this.cardTotalValue = cardTotalValue;
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

    public Double getCommissionTotalValue() {
        return commissionTotalValue;
    }

    public void setCommissionTotalValue(Double commissionTotalValue) {
        this.commissionTotalValue = commissionTotalValue;
    }

    public List<PaymentInstallmentDto> getInstallments() {
        return installments;
    }

    public void setInstallments(List<PaymentInstallmentDto> installments) {
        this.installments = installments;
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

    public Double getTotalCaptured() {
        return totalCaptured;
    }

    public void setTotalCaptured(Double totalCaptured) {
        this.totalCaptured = totalCaptured;
    }

    public Integer getNumberOrdersTransaction() {
        return numberOrdersTransaction;
    }

    public void setNumberOrdersTransaction(Integer numberOrdersTransaction) {
        this.numberOrdersTransaction = numberOrdersTransaction;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getEcommerceAuthorization() {
        return ecommerceAuthorization;
    }

    public void setEcommerceAuthorization(String ecommerceAuthorization) {
        this.ecommerceAuthorization = ecommerceAuthorization;
    }

    public Long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
