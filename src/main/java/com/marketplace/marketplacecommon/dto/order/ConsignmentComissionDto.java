package com.marketplace.marketplacecommon.dto.order;

public class ConsignmentComissionDto {

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
