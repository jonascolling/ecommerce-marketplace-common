package com.marketplace.marketplacecommon.dto.ecommerceproduct;

import com.marketplace.marketplacecommon.dto.product.ProductPriceUpdateDto;

public class EcommerceProductPriceUpdateDto {

    private String productId;

    private String sellerCode;

    private String skuSellerId;

    private Double price;

    private Double fullPrice;

    private Long sentTimestampEcommerce;

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
