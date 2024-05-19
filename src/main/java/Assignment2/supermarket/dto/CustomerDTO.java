package Assignment2.supermarket.dto;

import Assignment2.supermarket.model.Customer;

public class CustomerDTO {

    private Integer customerID;

    private String customerName;

    private String mobileNumber;

    private String address;

    private String gender;

    private String status;

    private Integer customerCategoryID;

    public CustomerDTO(){
    }

    public CustomerDTO(Customer customer){
        this.customerID = customer.getCustomerID();
        this.customerName = customer.getCustomerName();
        this.mobileNumber = customer.getMobileNumber();
        this.address = customer.getAddress();
        this.gender = customer.getGender();
        this.status = customer.getStatus();

        if (customer.getCustomerCategory() != null){
            this.customerCategoryID = customer.getCustomerCategory().getCustomerCategoryID();
        }
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCustomerCategoryID() {
        return customerCategoryID;
    }

    public void setCustomerCategoryID(Integer customerCategoryID) {
        this.customerCategoryID = customerCategoryID;
    }
}
