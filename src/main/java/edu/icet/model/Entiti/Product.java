package edu.icet.model.Entiti;

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
    private String id;
    private String name;
    private String description;
    private int qty;
    private Double unitPrice;
}
