package com.marketplace.marketplacecommon.dto.ecommercevendor;

public class EcommerceVendorDto {

    private String name;
    private String code;
    private boolean internalBrand;
    private String cpfCnpj;
    private String externalId;
    private boolean active;
    private String apiFreight;
    private String street;
    private String number;
    private String city;
    private String cep;
    private EcommerceAccountOfPaymentVendorDto account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isInternalBrand() {
        return internalBrand;
    }

    public void setInternalBrand(boolean internalBrand) {
        this.internalBrand = internalBrand;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getApiFreight() {
        return apiFreight;
    }

    public void setApiFreight(String apiFreight) {
        this.apiFreight = apiFreight;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public EcommerceAccountOfPaymentVendorDto getAccount() {
        return account;
    }

    public void setAccount(EcommerceAccountOfPaymentVendorDto account) {
        this.account = account;
    }
}
