package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.util.Date;
import java.util.Set;

public class EcommerceConsignmentDto {

    private EcommerceOrderDto order;
    private String code;
    private Date creationTime;
    private Integer daysToDelivery;
    private EcommerceWarehouseDto warehouse;
    private String deliveryType;
    private Double totalPrice;
    private Double subtotal;
    private Double discountAmount;
    private Double costOfDelivery;
    private EcommerceAddressDto shippingAddress;
    private Set<EcommerceConsignmentEntryDto> consignmentEntries;

    public EcommerceOrderDto getOrder() {
        return order;
    }

    public void setOrder(EcommerceOrderDto order) {
        this.order = order;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getDaysToDelivery() {
        return daysToDelivery;
    }

    public void setDaysToDelivery(Integer daysToDelivery) {
        this.daysToDelivery = daysToDelivery;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getCostOfDelivery() {
        return costOfDelivery;
    }

    public void setCostOfDelivery(Double costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }

    public EcommerceAddressDto getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(EcommerceAddressDto shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public EcommerceWarehouseDto getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(EcommerceWarehouseDto warehouse) {
        this.warehouse = warehouse;
    }

    public Set<EcommerceConsignmentEntryDto> getConsignmentEntries() {
        return consignmentEntries;
    }

    public void setConsignmentEntries(Set<EcommerceConsignmentEntryDto> consignmentEntries) {
        this.consignmentEntries = consignmentEntries;
    }
}
