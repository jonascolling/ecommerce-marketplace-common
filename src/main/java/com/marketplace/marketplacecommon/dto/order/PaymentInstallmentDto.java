package com.marketplace.marketplacecommon.dto.order;

public class PaymentInstallmentDto {

    private Integer installmentNumber;
    private String expectedPaymentDate;
    private Double installmentValue;
    private Double commissionValue;

    public Integer getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(Integer installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public String getExpectedPaymentDate() {
        return expectedPaymentDate;
    }

    public void setExpectedPaymentDate(String expectedPaymentDate) {
        this.expectedPaymentDate = expectedPaymentDate;
    }

    public Double getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue) {
        this.installmentValue = installmentValue;
    }

    public Double getCommissionValue() {
        return commissionValue;
    }

    public void setCommissionValue(Double commissionValue) {
        this.commissionValue = commissionValue;
    }
}
