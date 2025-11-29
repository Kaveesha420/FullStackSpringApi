package edu.icet.repositry;

import edu.icet.model.Entiti.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer,String> {
}
