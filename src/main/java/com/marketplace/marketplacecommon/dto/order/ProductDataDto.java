package com.marketplace.marketplacecommon.dto.order;

import java.util.Set;

public class ProductDataDto {

	private Long productItemId;
	private String categoryCode;
	private Long productItemSellerEcommerceId;
	private Double productItemSellerPrice;
	private Double height;
	private Double length;
	private Double weight;
	private Double width;
	private Integer deliveryTimeDays;
	private Set<String> urlImages;
	private String urlGuide;

	public ProductDataDto() {
		// Empty
	}

	public Long getProductItemId() {
		return productItemId;
	}

	public void setProductItemId(Long productItemId) {
		this.productItemId = productItemId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Long getProductItemSellerEcommerceId() {
		return productItemSellerEcommerceId;
	}

	public void setProductItemSellerEcommerceId(Long productItemSellerEcommerceId) {
		this.productItemSellerEcommerceId = productItemSellerEcommerceId;
	}

	public Double getProductItemSellerPrice() {
		return productItemSellerPrice;
	}

	public void setProductItemSellerPrice(Double productItemSellerPrice) {
		this.productItemSellerPrice = productItemSellerPrice;
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

	public Set<String> getUrlImages() {
		return urlImages;
	}

	public void setUrlImages(Set<String> urlImages) {
		this.urlImages = urlImages;
	}

	public String getUrlGuide() {
		return urlGuide;
	}

	public void setUrlGuide(String urlGuide) {
		this.urlGuide = urlGuide;
	}
}
