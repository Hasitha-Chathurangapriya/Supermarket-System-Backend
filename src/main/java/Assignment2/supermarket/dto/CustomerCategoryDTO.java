package Assignment2.supermarket.dto;

import Assignment2.supermarket.model.Customer;
import Assignment2.supermarket.model.CustomerCategory;

public class CustomerCategoryDTO {

    private Integer customerCategoryID;

    private String customerCategoryName;

    private String status;

    public CustomerCategoryDTO(){
    }

    public CustomerCategoryDTO(CustomerCategory customerCategory){
        this.customerCategoryID = customerCategory.getCustomerCategoryID();
        this.customerCategoryName = customerCategory.getCustomerCategoryName();
        this.status = customerCategory.getStatus();
    }

    public Integer getCustomerCategoryID() {
        return customerCategoryID;
    }

    public void setCustomerCategoryID(Integer customerCategoryID) {
        this.customerCategoryID = customerCategoryID;
    }

    public String getCustomerCategoryName() {
        return customerCategoryName;
    }

    public void setCustomerCategoryName(String customerCategoryName) {
        this.customerCategoryName = customerCategoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
