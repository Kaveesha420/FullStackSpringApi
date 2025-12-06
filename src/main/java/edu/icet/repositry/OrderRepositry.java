package edu.icet.repositry;

import edu.icet.model.Entiti.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositry extends JpaRepository<Orders,String> {
}
