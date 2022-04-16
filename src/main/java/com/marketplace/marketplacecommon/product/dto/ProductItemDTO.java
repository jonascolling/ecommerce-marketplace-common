package com.marketplace.marketplacecommon.product.dto;

import java.util.List;

public class ProductItemDTO {

    private String productItemId;

    private String ean;

    private String name;

    private String size;

    private String color;

    private boolean obsolete;

    private String variantSkuSellerId;

    private Double price;

    private Double fullPrice;

    private Integer stock;

    private Double height;

    private Double length;

    private Double weight;

    private Double width;

    private Integer deliveryTimeDays;

    private ProductItemSellerDTO productItemSeller;

    private List<ProductItemPictureDTO> productItemPicture;

    public String getProductItemId() {
        return productItemId;
    }

    public void setProductItemId(String productItemId) {
        this.productItemId = productItemId;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isObsolete() {
        return obsolete;
    }

    public void setObsolete(boolean obsolete) {
        this.obsolete = obsolete;
    }

    public String getVariantSkuSellerId() {
        return variantSkuSellerId;
    }

    public void setVariantSkuSellerId(String variantSkuSellerId) {
        this.variantSkuSellerId = variantSkuSellerId;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public ProductItemSellerDTO getProductItemSeller() {
        return productItemSeller;
    }

    public void setProductItemSeller(ProductItemSellerDTO productItemSeller) {
        this.productItemSeller = productItemSeller;
    }

    public List<ProductItemPictureDTO> getProductItemPicture() {
        return productItemPicture;
    }

    public void setProductItemPicture(List<ProductItemPictureDTO> productItemPicture) {
        this.productItemPicture = productItemPicture;
    }
}
