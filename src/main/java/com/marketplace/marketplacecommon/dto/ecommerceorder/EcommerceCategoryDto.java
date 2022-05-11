package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.util.List;

public class EcommerceCategoryDto {

    private List<EcommerceCategoryDto> supercategories;
    private String code;
    private String name;
    private Integer bcMainCategory;

    public Integer getBcMainCategory() {
        return bcMainCategory;
    }

    public void setBcMainCategory(Integer bcMainCategory) {
        this.bcMainCategory = bcMainCategory;
    }

    public List<EcommerceCategoryDto> getSupercategories() {
        return supercategories;
    }

    public void setSupercategories(List<EcommerceCategoryDto> supercategories) {
        this.supercategories = supercategories;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
