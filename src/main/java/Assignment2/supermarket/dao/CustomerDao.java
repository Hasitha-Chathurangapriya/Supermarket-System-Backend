package Assignment2.supermarket.dao;

import Assignment2.supermarket.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

    Customer findByCustomerID (Integer customerID);

    List<Customer> findAllByGender(String gender);
}
