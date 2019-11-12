package com.github.jrhenderson1988.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("order-service")
public interface OrderClient {
    @GetMapping("/")
    List<Object> getOrdersForCustomer(@RequestParam int customerId);
}
