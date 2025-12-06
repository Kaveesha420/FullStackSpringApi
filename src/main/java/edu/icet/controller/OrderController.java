package edu.icet.controller;

import edu.icet.model.Dto.OrderDto;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("addOrder")
    public String addOrder(@RequestBody OrderDto orderDto){
        return orderService.addOrder(orderDto);
    }
}
