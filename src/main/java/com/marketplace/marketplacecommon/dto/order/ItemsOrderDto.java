package com.marketplace.marketplacecommon.dto.order;

public class ItemsOrderDto {

	private Long productId;
	private String skuSellerCode;
	private Integer quantity;
	private Double basePrice;
	private Double discount;
	private Double totalPrice;
	private Double shippingValueItem;
	private String productName;
	private String size;
	private String voltage;
	private String color;
	private String ean;
	private Integer promotionId;
	private ProductDataDto productData;

	public ItemsOrderDto() {
		// Empty
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getSkuSellerCode() {
		return skuSellerCode;
	}

	public void setSkuSellerCode(String skuSellerCode) {
		this.skuSellerCode = skuSellerCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getShippingValueItem() {
		return shippingValueItem;
	}

	public void setShippingValueItem(Double shippingValueItem) {
		this.shippingValueItem = shippingValueItem;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public Integer getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Integer promotionId) {
		this.promotionId = promotionId;
	}

	public ProductDataDto getProductData() {
		return productData;
	}

	public void setProductData(ProductDataDto productData) {
		this.productData = productData;
	}
}
