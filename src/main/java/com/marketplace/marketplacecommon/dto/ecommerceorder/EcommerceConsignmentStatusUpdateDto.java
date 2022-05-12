package com.marketplace.marketplacecommon.dto.ecommerceorder;

import com.marketplace.marketplacecommon.dto.order.ConsignmentStatusUpdateDto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EcommerceConsignmentStatusUpdateDto {

    private String ecommerceConsignmentCode;
    private String orderReasonId;
    private String sellerId;
    private String status;
    private Date statusDate;
    private String orderSellerInvoiceId;
    private String invoiceKey;
    private String invoiceNumber;
    private Date invoiceDate;
    private String trackingData;
    private Date trackingDate;
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

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
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

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getTrackingData() {
        return trackingData;
    }

    public void setTrackingData(String trackingData) {
        this.trackingData = trackingData;
    }

    public Date getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(Date trackingDate) {
        this.trackingDate = trackingDate;
    }

    public Long getSentTimestampEcommerce() {
        return sentTimestampEcommerce;
    }

    public void setSentTimestampEcommerce(Long sentTimestampEcommerce) {
        this.sentTimestampEcommerce = sentTimestampEcommerce;
    }
}
