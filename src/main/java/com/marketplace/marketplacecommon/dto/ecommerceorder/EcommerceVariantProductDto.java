package com.marketplace.marketplacecommon.dto.ecommerceorder;

public class EcommerceVariantProductDto {

    private EcommerceBaseProductDto baseProduct;
    private String name;
    private String legacySKU;
    private String size;
    private Integer deliveryTimeDays;
    private Double height;
    private Double length;
    private Double weight;
    private Double width;
    private String productItemId;
    private Long pk;

    public String getLegacySKU() {
        return legacySKU;
    }

    public void setLegacySKU(String legacySKU) {
        this.legacySKU = legacySKU;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    public void setDeliveryTimeDays(Integer deliveryTimeDays) {
        this.deliveryTimeDays = deliveryTimeDays;
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

    public String getProductItemId() {
        return productItemId;
    }

    public void setProductItemId(String productItemId) {
        this.productItemId = productItemId;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EcommerceBaseProductDto getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(EcommerceBaseProductDto baseProduct) {
        this.baseProduct = baseProduct;
    }
}
