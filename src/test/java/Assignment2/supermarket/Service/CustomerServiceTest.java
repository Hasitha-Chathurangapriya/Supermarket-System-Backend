package Assignment2.supermarket.Service;

import Assignment2.supermarket.dto.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;


    @Test
    void saveAndUpdateCustomer() {
        CustomerDTO customer = new CustomerDTO();

        customer.setCustomerName(" Shanaka Bandara");
        customer.setMobileNumber("0712345678");
        customer.setAddress("No: 10, 1st Lane,Kurunegala");
        customer.setGender("Male");
        customer.setStatus("ACT");
        customer.setCustomerCategoryID(1);

        customerService.saveAndUpdateCustomer(customer);
    }

    @Test
    void getAllCustomers() {
        this.customerService.getAllCustomers();
    }

    @Test
    void getCustomerByID() {
        this.customerService.getCustomerByID(1);
    }

    @Test
    void getAllMaleCustomers() {
        this.customerService.getAllMaleCustomers("Male");
    }
}