package edu.icet.model.Entiti;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderDetails {
    @Id
    @Column(name = "order_Details_Id")
    private String orderDetailsId;
    @ManyToOne
    @JoinColumn(name = "order_Id")
    private Orders orderId;
    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Product productId;
    private int qty;

}
