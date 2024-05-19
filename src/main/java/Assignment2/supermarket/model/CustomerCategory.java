package Assignment2.supermarket.model;

import javax.persistence.*;

@Entity
@Table(name = "t_customer_category")
public class CustomerCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_CATEGORY_ID", nullable = false, updatable = false)
    private Integer customerCategoryID;

    @Column(name = "CUSTOMER_CATEGORY_NAME")
    private String customerCategoryName;

    @Column(name = "STATUS")
    private String status;


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
