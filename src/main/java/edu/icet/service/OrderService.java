package edu.icet.service;

import edu.icet.model.Dto.OrderDto;
import edu.icet.model.Entiti.Customer;
import edu.icet.model.Entiti.Orders;
import edu.icet.model.Entiti.OrderDetails;
import edu.icet.model.Entiti.Product;
import edu.icet.repositry.CustomerRepositry;
import edu.icet.repositry.OrderDetailsRepositry;
import edu.icet.repositry.OrderRepositry;
import edu.icet.repositry.ProductRepositry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class OrderService {
    private final OrderRepositry orderRepositry;
    private final OrderDetailsRepositry orderDetailsRepositry;
    private final ProductRepositry productRepositry;
    private final CustomerRepositry customerRepositry;

    public String addOrder(OrderDto orderDto) {
        try {
            Customer customer = customerRepositry.findById(orderDto.getCustomerId()).orElse(null);
            Product product = productRepositry.findById(orderDto.getProductId()).orElse(null);
            if (customer != null && product != null && (product.getQty()-orderDto.getQty()) >=0 ){
                List<Orders> orderList = orderRepositry.findAll();
                String genaratedId="OR001";
                int genIntId=1;
                for (Orders order:orderList){
                    if (order.getOrderId().equals(genaratedId)){
                        genIntId++;
                        genaratedId=String.format("OR%03d",genIntId);
                    }else{break;}
                }
                orderRepositry.save(new Orders(
                        genaratedId,
                        customer,
                        LocalDate.now()
                ));
                List<OrderDetails> orderDetails = orderDetailsRepositry.findAll();
                String genaratedId2="OD001";
                int genIntId2=1;
                for (OrderDetails orderDetails1 : orderDetails){
                    if (orderDetails1.getOrderDetailsId().equals(genaratedId2)){
                        genIntId2++;
                        genaratedId2=String.format("OD%03d",genIntId2);
                    }else{break;}
                }
                orderDetailsRepositry.save(new OrderDetails(
                        genaratedId2,
                        orderRepositry.findById(genaratedId).orElse(null),
                        product,
                        orderDto.getQty()
                ));
                product.setQty(product.getQty()-orderDto.getQty());
                productRepositry.save(product);
                return "Order Added Successfully";
            }else{
                return "Something Went Wrong";
            }
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
