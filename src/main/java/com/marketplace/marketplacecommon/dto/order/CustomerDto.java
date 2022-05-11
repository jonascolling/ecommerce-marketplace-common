package com.marketplace.marketplacecommon.dto.order;

public class CustomerDto {

	private Long ecommerceCustomerId;
	private String name;
	private String customerType;
	private String cpf;
	private String state;
	private String email;
	private String ddd;
	private String phone;

	public CustomerDto() {
		// Empty
	}

	public Long getEcommerceCustomerId() {
		return ecommerceCustomerId;
	}

	public void setEcommerceCustomerId(Long ecommerceCustomerId) {
		this.ecommerceCustomerId = ecommerceCustomerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
