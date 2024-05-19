package Assignment2.supermarket.dao;

import Assignment2.supermarket.model.Customer;
import Assignment2.supermarket.model.CustomerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCategoryDao  extends JpaRepository<CustomerCategory,Integer> {

    CustomerCategory  findByCustomerCategoryID(Integer customerCategoryID);
}
