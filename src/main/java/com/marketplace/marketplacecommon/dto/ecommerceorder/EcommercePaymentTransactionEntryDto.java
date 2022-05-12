package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.math.BigDecimal;
import java.util.Date;

public class EcommercePaymentTransactionEntryDto {

    private String type;
    private Date creationtime;
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
}
