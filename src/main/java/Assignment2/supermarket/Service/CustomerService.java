package Assignment2.supermarket.Service;

import Assignment2.supermarket.dao.CustomerCategoryDao;
import Assignment2.supermarket.dao.CustomerDao;
import Assignment2.supermarket.dto.CustomerDTO;
import Assignment2.supermarket.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerCategoryDao customerCategoryDao;

    public CustomerDTO saveAndUpdateCustomer(CustomerDTO customerDTO){

        Customer customer = new Customer();

        customer.setCustomerName(customerDTO.getCustomerName());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        customer.setAddress(customerDTO.getAddress());
        customer.setGender(customerDTO.getGender());
        customer.setStatus(customerDTO.getStatus());
        customer.setCustomerCategory(this.customerCategoryDao.getById(customerDTO.getCustomerCategoryID()));

        customer = this.customerDao.saveAndFlush(customer);

        return new CustomerDTO(customer);
    }

    public List<CustomerDTO> getAllCustomers(){
        List<Customer> customers = this.customerDao.findAll();

        List<CustomerDTO> customerDTOs = new ArrayList<>();

        for (Customer customer : customers){
            CustomerDTO customerDTO = new CustomerDTO(customer);
            customerDTOs.add(customerDTO);
        }
        return customerDTOs;
    }

    public CustomerDTO  getCustomerByID(Integer customerID){
        Customer customer = this.customerDao.findByCustomerID(customerID);
        return new CustomerDTO(customer);
    }

    public List<CustomerDTO> getAllMaleCustomers(String gender){
        List<Customer> customers = this.customerDao.findAllByGender(gender);

        List<CustomerDTO> customerDTOs = new ArrayList<>();

        for (Customer customer : customers){
            CustomerDTO customerDTO = new CustomerDTO(customer);

            customerDTOs.add(customerDTO);
        }
        return customerDTOs;
    }
}
