package Assignment2.supermarket.Controller;

import Assignment2.supermarket.Service.CustomerCategoryService;
import Assignment2.supermarket.dto.CustomerCategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customerCategory")
public class CustomerCategoryController {

    @Autowired
    private CustomerCategoryService customerCategoryService;

    @RequestMapping(value ="/saveAndUpdateCustomerCategory",method = RequestMethod.POST)
    public ResponseEntity<CustomerCategoryDTO> saveAndUpdateCustomerCategory(@RequestBody CustomerCategoryDTO customerCategoryDTO){
        CustomerCategoryDTO newCustomerCategory = this.customerCategoryService.saveAndUpdateCustomerCategory(customerCategoryDTO);

        return new ResponseEntity<>(newCustomerCategory, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/getAllCustomerCategories",method = RequestMethod.GET)
    public ResponseEntity<List<CustomerCategoryDTO>> getAllCustomerCategories(){
        List<CustomerCategoryDTO> customerCategoryDTOs = this.customerCategoryService.getAllCustomerCategories();

        return new ResponseEntity<>(customerCategoryDTOs,HttpStatus.OK);
    }

    @RequestMapping(value = "/getCustomerCategoryByID/{customerCategoryID}",method = RequestMethod.GET)
    public ResponseEntity<CustomerCategoryDTO>  getCustomerCategoryByID(@PathVariable Integer customerCategoryID){
        CustomerCategoryDTO customerCategory = this.customerCategoryService.getCustomerCategoryByID(customerCategoryID);

        return new ResponseEntity<>(customerCategory,HttpStatus.OK);
    }
}
