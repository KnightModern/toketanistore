package com.toketanistore.app.registration;

public class RegistrationDataModel {

    private String store_id;
    private String store_name;
    private String employee_name;
    private String phone_number;
    private String city;
    private String admin_share;
    private String device_id;
    private String email;
    private String password;
    private String del_range;
    private String lat;
    private String lng;
    private String address;
    private String admin_approval;

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdmin_share() {
        return admin_share;
    }

    public void setAdmin_share(String admin_share) {
        this.admin_share = admin_share;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDel_range() {
        return del_range;
    }

    public void setDel_range(String del_range) {
        this.del_range = del_range;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdmin_approval() {
        return admin_approval;
    }

    public void setAdmin_approval(String admin_approval) {
        this.admin_approval = admin_approval;
    }

    @Override
    public String toString() {
        return "RegistrationDataModel{" +
                "store_id='" + store_id + '\'' +
                ", store_name='" + store_name + '\'' +
                ", employee_name='" + employee_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", city='" + city + '\'' +
                ", admin_share='" + admin_share + '\'' +
                ", device_id='" + device_id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", del_range='" + del_range + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", address='" + address + '\'' +
                ", admin_approval='" + admin_approval + '\'' +
                '}';
    }
}
