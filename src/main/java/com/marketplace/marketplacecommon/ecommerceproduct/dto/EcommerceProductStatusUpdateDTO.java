package com.marketplace.marketplacecommon.ecommerceproduct.dto;

import com.marketplace.marketplacecommon.product.dto.ProductStatusUpdateDTO;

public class EcommerceProductStatusUpdateDTO {

    private String productId;

    private String sellerCode;

    private String skuSellerId;

    private boolean obsolete;

    private Long sentTimestampEcommerce;

    public EcommerceProductStatusUpdateDTO() {
    }

    public EcommerceProductStatusUpdateDTO(ProductStatusUpdateDTO productStatusUpdateDTO, String sellerCode) {
        this.obsolete = productStatusUpdateDTO.isObsolete();
        this.productId = productStatusUpdateDTO.getProductId();
        this.sentTimestampEcommerce = productStatusUpdateDTO.getSentTimestampEcommerce();
        this.skuSellerId = productStatusUpdateDTO.getSkuSellerId();
        this.sellerCode = sellerCode;
        this.productId = productStatusUpdateDTO.getProductId();
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

    public boolean isObsolete() {
        return obsolete;
    }

    public void setObsolete(boolean obsolete) {
        this.obsolete = obsolete;
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