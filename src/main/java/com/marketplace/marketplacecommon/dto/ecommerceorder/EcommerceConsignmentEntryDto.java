package com.marketplace.marketplacecommon.dto.ecommerceorder;

public class EcommerceConsignmentEntryDto {

    private EcommerceConsignmentDto consignment;
    private EcommerceOrderEntryDto orderEntry;

    public EcommerceConsignmentDto getConsignment() {
        return consignment;
    }

    public void setConsignment(EcommerceConsignmentDto consignment) {
        this.consignment = consignment;
    }

    public EcommerceOrderEntryDto getOrderEntry() {
        return orderEntry;
    }

    public void setOrderEntry(EcommerceOrderEntryDto orderEntry) {
        this.orderEntry = orderEntry;
    }
}
