package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.util.List;
import java.util.Set;

public class EcommerceOrderDto {

    private Set<EcommerceConsignmentDto> consingments;
    private List<EcommercePaymentTransactionDto> paymentTransactions;
    private EcommerceCustomerDto user;
    private String code;
    private EcommercePaymentModeDto paymentMode;
    private EcommercePaymentInfoDto paymentInfo;

    public EcommercePaymentInfoDto getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(EcommercePaymentInfoDto paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Set<EcommerceConsignmentDto> getConsingments() {
        return consingments;
    }

    public void setConsingments(Set<EcommerceConsignmentDto> consingments) {
        this.consingments = consingments;
    }

    public List<EcommercePaymentTransactionDto> getPaymentTransactions() {
        return paymentTransactions;
    }

    public void setPaymentTransactions(List<EcommercePaymentTransactionDto> paymentTransactions) {
        this.paymentTransactions = paymentTransactions;
    }

    public EcommerceCustomerDto getUser() {
        return user;
    }

    public void setUser(EcommerceCustomerDto user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public EcommercePaymentModeDto getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(EcommercePaymentModeDto paymentMode) {
        this.paymentMode = paymentMode;
    }
}
