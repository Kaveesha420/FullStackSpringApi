package edu.icet.model.Entiti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Order {
    @Id
    @Column(name = "order_id")
    private String orderId;
    private String orderDetailsId;
    private String customerId;
    private String productId;
    private String qty;
}
