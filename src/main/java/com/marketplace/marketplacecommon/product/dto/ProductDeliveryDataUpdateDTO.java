package com.marketplace.marketplacecommon.product.dto;

public class ProductDeliveryDataUpdateDTO {

    private String productId;

    private String sellerId;

    private String skuSellerId;

    private Double height;

    private Double length;

    private Double weight;

    private Double width;

    private Integer deliveryTimeDays;

    private Long sentTimestampEcommerce;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSkuSellerId() {
        return skuSellerId;
    }

    public void setSkuSellerId(String skuSellerId) {
        this.skuSellerId = skuSellerId;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Integer getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    public void setDeliveryTimeDays(Integer deliveryTimeDays) {
        this.deliveryTimeDays = deliveryTimeDays;
    }

    public Long getSentTimestampEcommerce() {
        return sentTimestampEcommerce;
    }

    public void setSentTimestampEcommerce(Long sentTimestampEcommerce) {
        this.sentTimestampEcommerce = sentTimestampEcommerce;
    }
}
