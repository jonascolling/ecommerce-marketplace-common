package com.marketplace.marketplacecommon.ecommerceproduct.dto;

import com.marketplace.marketplacecommon.product.dto.ProductPriceUpdateDTO;

public class EcommerceProductPriceUpdateDTO {

    private String productId;

    private String sellerCode;

    private String skuSellerId;

    private Double price;

    private Double fullPrice;

    private Long sentTimestampEcommerce;

    public EcommerceProductPriceUpdateDTO() {
    }

    public EcommerceProductPriceUpdateDTO(ProductPriceUpdateDTO productPriceUpdateDTO, String sellerCode) {
        this.fullPrice = productPriceUpdateDTO.getFullPrice();
        this.price = productPriceUpdateDTO.getPrice();
        this.productId = productPriceUpdateDTO.getProductId();
        this.sentTimestampEcommerce = productPriceUpdateDTO.getSentTimestampEcommerce();
        this.skuSellerId = productPriceUpdateDTO.getSkuSellerId();
        this.sellerCode = sellerCode;
        this.productId = productPriceUpdateDTO.getProductId();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Long getSentTimestampEcommerce() {
        return sentTimestampEcommerce;
    }

    public void setSentTimestampEcommerce(Long sentTimestampEcommerce) {
        this.sentTimestampEcommerce = sentTimestampEcommerce;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
}
