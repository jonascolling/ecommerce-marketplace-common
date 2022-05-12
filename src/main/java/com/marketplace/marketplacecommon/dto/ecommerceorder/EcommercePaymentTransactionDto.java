package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class EcommercePaymentTransactionDto {

    private Date creationTime;
    private String code;
    private BigDecimal plannedAmount;
    private Short installments;
    private String requestId;
    private List<EcommercePaymentTransactionEntryDto> entries;

    public List<EcommercePaymentTransactionEntryDto> getEntries() {
        return entries;
    }

    public void setEntries(List<EcommercePaymentTransactionEntryDto> entries) {
        this.entries = entries;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(BigDecimal plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public Short getInstallments() {
        return installments;
    }

    public void setInstallments(Short installments) {
        this.installments = installments;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
