package Assignment2.supermarket.Service;

import Assignment2.supermarket.dto.CustomerCategoryDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerCategoryServiceTest {

    @Autowired
    private CustomerCategoryService customerCategoryService;

    @Test
    void saveAndUpdateCustomerCategory() {
        CustomerCategoryDTO customerCategory = new CustomerCategoryDTO();

        customerCategory.setCustomerCategoryName(" Loyal Customers");
        customerCategory.setStatus("ACT");
        customerCategoryService.saveAndUpdateCustomerCategory(customerCategory);
    }

    @Test
    void getAllCustomerCategories() {
        this.customerCategoryService.getAllCustomerCategories();
    }

    @Test
    void getCustomerCategoryByID() {
        this.customerCategoryService.getCustomerCategoryByID(2);
    }
}