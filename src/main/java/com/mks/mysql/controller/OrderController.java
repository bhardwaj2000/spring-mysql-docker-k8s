package com.mks.mysql.controller;

import com.mks.mysql.entity.Orders;
import com.mks.mysql.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

//    http://localhost:8080/swagger-ui/index.html
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/saveOrder")
    public Orders saveOrder(@RequestBody Orders orders){
        return orderRepository.save(orders);
    }

    @GetMapping("/getOrders")
    public List<Orders> getOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return orderRepository.findById(id).get();
    }

}
