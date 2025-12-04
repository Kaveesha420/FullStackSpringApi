package edu.icet.model.Entiti;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Orders {
    @Id
    @Column(name = "order_Id")
    private String orderId;
    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Customer customerId;
    private LocalDate orderDate;
}
