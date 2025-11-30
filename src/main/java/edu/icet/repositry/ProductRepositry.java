package edu.icet.repositry;

import edu.icet.model.Entiti.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositry extends JpaRepository<Product,String> {
}
