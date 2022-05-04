package com.marketplace.marketplacecommon.ecommerceproduct.dto;

import com.marketplace.marketplacecommon.product.dto.ProductStockUpdateDTO;

public class EcommerceProductStockUpdateDTO {

    private String productId;

    private String sellerCode;

    private String skuSellerId;

    private Integer stock;

    private Long sentTimestampEcommerce;

    public EcommerceProductStockUpdateDTO() {
    }

    public EcommerceProductStockUpdateDTO(ProductStockUpdateDTO productStockUpdateDTO, String sellerCode) {
        this.stock = productStockUpdateDTO.getStock();
        this.productId = productStockUpdateDTO.getProductId();
        this.sentTimestampEcommerce = productStockUpdateDTO.getSentTimestampEcommerce();
        this.skuSellerId = productStockUpdateDTO.getSkuSellerId();
        this.sellerCode = sellerCode;
        this.productId = productStockUpdateDTO.getProductId();
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
