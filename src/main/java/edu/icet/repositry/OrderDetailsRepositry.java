package edu.icet.repositry;

import edu.icet.model.Entiti.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepositry extends JpaRepository<OrderDetails,String> {
}
