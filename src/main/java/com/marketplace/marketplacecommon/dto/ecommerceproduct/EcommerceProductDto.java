package com.marketplace.marketplacecommon.dto.ecommerceproduct;

import java.util.List;

public class EcommerceProductDto {

    private String productId;

    private String productSkuSellerId;

    private String brand;

    private String name;

    private String model;

    private String description;

    private String sellerCode;

    private List<EcommerceProductAttributeValueDto> attributeValue;

    private List<EcommerceProductItemDto> productItem;

    private List<EcommerceProductItemPictureDto> productItemPicture;

    private List<String> categories;

    private Double heelSize;

    private String bagDimension;

    private String bagVolume;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<EcommerceProductAttributeValueDto> getAttributeValue() {
        return attributeValue;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public void setAttributeValue(List<EcommerceProductAttributeValueDto> attributeValue) {
        this.attributeValue = attributeValue;
    }

    public List<EcommerceProductItemDto> getProductItem() {
        return productItem;
    }

    public void setProductItem(List<EcommerceProductItemDto> productItem) {
        this.productItem = productItem;
    }

    public List<EcommerceProductItemPictureDto> getProductItemPicture() {
        return productItemPicture;
    }

    public void setProductItemPicture(List<EcommerceProductItemPictureDto> productItemPicture) {
        this.productItemPicture = productItemPicture;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Double getHeelSize() {
        return heelSize;
    }

    public void setHeelSize(Double heelSize) {
        this.heelSize = heelSize;
    }

    public String getBagDimension() {
        return bagDimension;
    }

    public void setBagDimension(String bagDimension) {
        this.bagDimension = bagDimension;
    }

    public String getBagVolume() {
        return bagVolume;
    }

    public void setBagVolume(String bagVolume) {
        this.bagVolume = bagVolume;
    }
}
