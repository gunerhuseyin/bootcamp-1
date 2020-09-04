package org.kodluyoruz.trendyol.a.unittest;

public class Address {

    // impl updateAddress Test

    private String addressText;
    private String city;
    private Long cityCode;
    private String district;
    private Long districtCode;
    private String postalCode;
    private String countryCode;
    private String phone;
    private String email;

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Long districtCode) {
        this.districtCode = districtCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateAddress(Address address) {
        addressText = address.getAddressText();
        city = address.getCity();
        cityCode = address.getCityCode();
        district = address.getDistrict();
        postalCode = address.getPostalCode();
        countryCode = address.getCountryCode();
        phone = address.getPhone();
    }
}
