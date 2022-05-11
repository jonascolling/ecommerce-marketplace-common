package com.marketplace.marketplacecommon.dto.ecommerceorder;

public class EcommerceOrderEntryDto {

    private Double basePrice;
    private Double totalPrice;
    private Long quantity;
    private EcommerceVariantProductDto product;

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public EcommerceVariantProductDto getProduct() {
        return product;
    }

    public void setProduct(EcommerceVariantProductDto product) {
        this.product = product;
    }
}
