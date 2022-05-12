package com.marketplace.marketplacecommon.dto.ecommerceorder;

import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;

public class EcommerceConsignmentComissionDto {

    private String ecommerceConsignmentCode;
    private Double orderCommissionTotal;

    public String getEcommerceConsignmentCode() {
        return ecommerceConsignmentCode;
    }

    public void setEcommerceConsignmentCode(String ecommerceConsignmentCode) {
        this.ecommerceConsignmentCode = ecommerceConsignmentCode;
    }

    public Double getOrderCommissionTotal() {
        return orderCommissionTotal;
    }

    public void setOrderCommissionTotal(Double orderCommissionTotal) {
        this.orderCommissionTotal = orderCommissionTotal;
    }
}
