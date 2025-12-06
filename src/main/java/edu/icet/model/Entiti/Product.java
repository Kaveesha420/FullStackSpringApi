package edu.icet.model.Entiti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
    @Id
    @Column(name = "product_Id")
    private String productId;
    private String name;
    private String description;
    private int qty;
    private Double unitPrice;
}
