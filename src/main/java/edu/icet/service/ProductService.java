package edu.icet.service;

import edu.icet.model.Dto.ProductDto;
import edu.icet.model.Entiti.Product;
import edu.icet.repositry.CustomerRepositry;
import edu.icet.repositry.ProductRepositry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    final ProductRepositry productRepositry;

    public String addProduct(ProductDto productDto) {
        List<Product> products = productRepositry.findAll();
        String genarateId = "P001";
        int genIntId = 1;

        for (Product product:products){
            if (product.getId().equals(genarateId)){
                genIntId++;
                genarateId=String.format("P%03d",genIntId);
            }else{break;}
        }
        Product product = new Product(
                genarateId,
                productDto.getName(),
                productDto.getDescription(),
                productDto.getQty(),
                productDto.getUnitPrice()
        );
        productRepositry.save(product);
        return "Customer added Successfuly";
    }

    public ProductDto searchProduct(String id) {
        Product product = productRepositry.findById(id).orElse(null);
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getQty(),
                product.getUnitPrice()
        );
    }
}
