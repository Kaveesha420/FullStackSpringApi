package edu.icet.model.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDto {
    private String orderId;
    private String orderDetailsId;
    private String customerId;
    private String productId;
    private String qty;
}
