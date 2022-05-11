package com.marketplace.marketplacecommon.dto.product;

import java.util.List;

public class ProductDto {

    private String productId;

    private String productSkuSellerId;

    private String brand;

    private String name;

    private String model;

    private String groupEcommerceCode;

    private String description;

    private String guide;

    private String sellerId;

    private String gender;

    private List<ProductAttributeValueDto> attributeValue;

    private List<ProductItemDto> productItem;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductSkuSellerId() {
        return productSkuSellerId;
    }

    public void setProductSkuSellerId(String productSkuSellerId) {
        this.productSkuSellerId = productSkuSellerId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGroupEcommerceCode() {
        return groupEcommerceCode;
    }

    public void setGroupEcommerceCode(String groupEcommerceCode) {
        this.groupEcommerceCode = groupEcommerceCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<ProductAttributeValueDto> getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(List<ProductAttributeValueDto> attributeValue) {
        this.attributeValue = attributeValue;
    }

    public List<ProductItemDto> getProductItem() {
        return productItem;
    }

    public void setProductItem(List<ProductItemDto> productItem) {
        this.productItem = productItem;
    }
}
