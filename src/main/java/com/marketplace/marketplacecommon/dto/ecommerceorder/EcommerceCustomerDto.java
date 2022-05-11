package com.marketplace.marketplacecommon.dto.ecommerceorder;

import java.util.Collection;

public class EcommerceCustomerDto {

    private String cpf;
    private String name;
    private String contactEmail;
    private Collection<EcommercePhoneNumberDto> phoneNumberList;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Collection<EcommercePhoneNumberDto> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(Collection<EcommercePhoneNumberDto> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }
}
