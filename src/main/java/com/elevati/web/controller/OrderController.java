package com.elevati.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/order")
public class OrderController
{

    @GetMapping
    public String index()
    {
        return "order";  // order.html view file
    }

    @GetMapping(path = "/sync")
    public ModelAndView sync()
    {
        // TODO: Fetch Orders from sample Shopify api response available at the below endpoint https://elevatitech.com/api/test/shopify/orders
        // TODO: And Persist orders in a MySQL DB

        return new ModelAndView("redirect:/");
    }
}
