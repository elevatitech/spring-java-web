package com.elevati.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/v1/orders")
@RequestScope
public class OrderApiController
{
    @GetMapping
    public Iterable<Object> getAll()
    {
        ArrayList<Object> orders = new ArrayList<>();
        return orders;
    }

}
