package com.marketplace.marketplacecommon.dto.order;

public class ConsignmentDto {

    private String ecommerceConsignmentCode;
    private String orderReasonId;
    private String sellerId;
    private String status;
    private String statusDate;
    private String orderSellerInvoiceId;
    private String invoiceKey;
    private String invoiceNumber;
    private String invoiceDate;
    private String trackingData;
    private String trackingDate;
    private Long sentTimestampEcommerce;

    public String getEcommerceConsignmentCode() {
        return ecommerceConsignmentCode;
    }

    public void setEcommerceConsignmentCode(String ecommerceConsignmentCode) {
        this.ecommerceConsignmentCode = ecommerceConsignmentCode;
    }

    public String getOrderReasonId() {
        return orderReasonId;
    }

    public void setOrderReasonId(String orderReasonId) {
        this.orderReasonId = orderReasonId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getOrderSellerInvoiceId() {
        return orderSellerInvoiceId;
    }

    public void setOrderSellerInvoiceId(String orderSellerInvoiceId) {
        this.orderSellerInvoiceId = orderSellerInvoiceId;
    }

    public String getInvoiceKey() {
        return invoiceKey;
    }

    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getTrackingData() {
        return trackingData;
    }

    public void setTrackingData(String trackingData) {
        this.trackingData = trackingData;
    }

    public String getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(String trackingDate) {
        this.trackingDate = trackingDate;
    }

    public Long getSentTimestampEcommerce() {
        return sentTimestampEcommerce;
    }

    public void setSentTimestampEcommerce(Long sentTimestampEcommerce) {
        this.sentTimestampEcommerce = sentTimestampEcommerce;
    }
}
