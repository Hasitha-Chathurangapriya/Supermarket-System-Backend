package Assignment2.supermarket.Controller;

import Assignment2.supermarket.Service.CustomerService;
import Assignment2.supermarket.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/saveAndUpdateCustomer",method = RequestMethod.POST)
    public ResponseEntity<CustomerDTO> saveAndUpdateCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO newCustomer = this.customerService.saveAndUpdateCustomer(customerDTO);

        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/getAllCustomers",method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
        List<CustomerDTO> customers = this.customerService.getAllCustomers();

        return new ResponseEntity<>(customers,HttpStatus.OK);
    }

    @RequestMapping(value = "/getCustomerByID/{customerID}",method = RequestMethod.GET)
    public ResponseEntity<CustomerDTO> getCustomerByID(@PathVariable Integer customerID){
        CustomerDTO customer = this.customerService.getCustomerByID(customerID);

        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllMaleCustomers/{gender}",method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDTO>> getAllMaleCustomers(@PathVariable String gender){
        List<CustomerDTO> customers = this.customerService.getAllMaleCustomers(gender);

        return new ResponseEntity<>(customers,HttpStatus.OK);
    }
}
