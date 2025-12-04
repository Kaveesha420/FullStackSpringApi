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
public class OrderDetails {
    @Id
    @Column(name = "order_Details")
    private String orderDetailsId;
    private String orderId;
    private String productId;
    private String qty;

}
