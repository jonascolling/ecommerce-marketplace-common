package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.util.Collection;

public class EcommerceBaseProductDto {

    private Collection<EcommerceCategoryDto> supercategories;
    private String productId;

    public Collection<EcommerceCategoryDto> getSupercategories() {
        return supercategories;
    }

    public void setSupercategories(Collection<EcommerceCategoryDto> supercategories) {
        this.supercategories = supercategories;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
