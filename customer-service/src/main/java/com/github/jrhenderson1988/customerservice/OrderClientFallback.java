package com.github.jrhenderson1988.customerservice;

import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class OrderClientFallback implements OrderClient {
    @Override
    public Object getOrdersForCustomer(int customerId) {
        return Collections.emptyList();
    }
}
