package edu.icet.repositry;

import edu.icet.model.Entiti.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositry extends JpaRepository<Product,String> {
}
