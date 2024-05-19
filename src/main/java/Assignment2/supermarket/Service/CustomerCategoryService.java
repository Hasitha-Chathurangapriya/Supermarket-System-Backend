package Assignment2.supermarket.Service;

import Assignment2.supermarket.dao.CustomerCategoryDao;
import Assignment2.supermarket.dao.CustomerDao;
import Assignment2.supermarket.dto.CustomerCategoryDTO;
import Assignment2.supermarket.model.CustomerCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerCategoryService {

    @Autowired
    private CustomerCategoryDao customerCategoryDao;

    @Autowired
    private CustomerDao customerDao;

    public CustomerCategoryDTO saveAndUpdateCustomerCategory(CustomerCategoryDTO customerCategoryDTO){
        CustomerCategory customerCategor = new CustomerCategory();

        customerCategor.setCustomerCategoryName(customerCategoryDTO.getCustomerCategoryName());
        customerCategor.setStatus(customerCategoryDTO.getStatus());

        customerCategor = this.customerCategoryDao.saveAndFlush(customerCategor);

        return new CustomerCategoryDTO(customerCategor);
    }

    public List<CustomerCategoryDTO> getAllCustomerCategories(){
        List<CustomerCategory> customerCategories = this.customerCategoryDao.findAll();

        List<CustomerCategoryDTO> customerCategoryDTOs = new ArrayList<>();

        for (CustomerCategory customerCategory : customerCategories){
            CustomerCategoryDTO customerCategoryDTO = new CustomerCategoryDTO(customerCategory);

            customerCategoryDTOs.add(customerCategoryDTO);
        }
        return customerCategoryDTOs;
    }

    public CustomerCategoryDTO  getCustomerCategoryByID(Integer customerCategoryID){
        CustomerCategory customerCategory = this.customerCategoryDao.findByCustomerCategoryID(customerCategoryID);
        return new CustomerCategoryDTO(customerCategory);
    }
}
