package com.elevati.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/order")
public class OrderController
{

    @GetMapping
    public String getAllOrders()
    {
        return "order";  // order.html view file
    }
}
