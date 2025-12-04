package edu.icet.repositry;

import edu.icet.model.Entiti.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositry extends JpaRepository<Order,String> {
}
