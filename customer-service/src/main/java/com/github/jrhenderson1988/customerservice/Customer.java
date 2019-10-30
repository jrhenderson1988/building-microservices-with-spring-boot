package com.github.jrhenderson1988.customerservice;

public class Customer {
    private final int id;
    private final String name;

    public Customer(final int id,  final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
