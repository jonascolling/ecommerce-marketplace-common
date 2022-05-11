package com.marketplace.marketplacecommon.dto.order;

import java.util.List;

public class OrderDto {

	private String ecommerceConsignmentCode;
	private String ecommerceOrderCode;
	private Long sellerId;
	private Double costProducts;
	private Double shippingValue;
	private Double costDiscount;
	private Double totalPrice;
	private String shippingType;
	private String creationTime;
	private Integer maximumDeliveryDays;
	private String channelType;
	private CustomerDto customer;
	private ShippingAddressDto shippingAddressApiDto;
	private List<ItemsOrderDto> itemsOrder;
	private String splitFlow;
	private Integer numberOrdersTotal;
	private List<String> paymentTypes;
	private List<OrderPaymentDto> orderPayment;

	public OrderDto() {
		// Empty
	}

	public String getEcommerceConsignmentCode() {
		return ecommerceConsignmentCode;
	}

	public void setEcommerceConsignmentCode(String ecommerceConsignmentCode) {
		this.ecommerceConsignmentCode = ecommerceConsignmentCode;
	}

	public String getEcommerceOrderCode() {
		return ecommerceOrderCode;
	}

	public void setEcommerceOrderCode(String ecommerceOrderCode) {
		this.ecommerceOrderCode = ecommerceOrderCode;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Double getCostProducts() {
		return costProducts;
	}

	public void setCostProducts(Double costProducts) {
		this.costProducts = costProducts;
	}

	public Double getShippingValue() {
		return shippingValue;
	}

	public void setShippingValue(Double shippingValue) {
		this.shippingValue = shippingValue;
	}

	public Double getCostDiscount() {
		return costDiscount;
	}

	public void setCostDiscount(Double costDiscount) {
		this.costDiscount = costDiscount;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public Integer getMaximumDeliveryDays() {
		return maximumDeliveryDays;
	}

	public void setMaximumDeliveryDays(Integer maximumDeliveryDays) {
		this.maximumDeliveryDays = maximumDeliveryDays;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public ShippingAddressDto getShippingAddressApiDto() {
		return shippingAddressApiDto;
	}

	public void setShippingAddressApiDto(ShippingAddressDto shippingAddressApiDto) {
		this.shippingAddressApiDto = shippingAddressApiDto;
	}

	public List<ItemsOrderDto> getItemsOrder() {
		return itemsOrder;
	}

	public void setItemsOrder(List<ItemsOrderDto> itemsOrder) {
		this.itemsOrder = itemsOrder;
	}

	public String getSplitFlow() {
		return splitFlow;
	}

	public void setSplitFlow(String splitFlow) {
		this.splitFlow = splitFlow;
	}

	public Integer getNumberOrdersTotal() {
		return numberOrdersTotal;
	}

	public void setNumberOrdersTotal(Integer numberOrdersTotal) {
		this.numberOrdersTotal = numberOrdersTotal;
	}

	public List<String> getPaymentTypes() {
		return paymentTypes;
	}

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}

	public List<OrderPaymentDto> getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(List<OrderPaymentDto> orderPayment) {
		this.orderPayment = orderPayment;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
}
