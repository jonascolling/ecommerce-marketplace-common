package com.marketplace.marketplacecommon.dto.ecommerceorder;

public class EcommerceAddressDto {

    private String town;
    private String streetname;
    private String streetnumber;
    private String district;
    private String complement;
    private String postalcode;
    private EcommerceRegionDto region;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public EcommerceRegionDto getRegion() {
        return region;
    }

    public void setRegion(EcommerceRegionDto region) {
        this.region = region;
    }
}
