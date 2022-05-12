package com.marketplace.marketplacecommon.dto.order;

import java.util.List;

public class PaymentConfirmationDto {

    private String ecommerceConsignmentCode;
    private List<PaymentContentDto> payments;

    public String getEcommerceConsignmentCode() {
        return ecommerceConsignmentCode;
    }

    public void setEcommerceConsignmentCode(String ecommerceConsignmentCode) {
        this.ecommerceConsignmentCode = ecommerceConsignmentCode;
    }

    public List<PaymentContentDto> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentContentDto> payments) {
        this.payments = payments;
    }
}
