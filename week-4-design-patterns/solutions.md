---
layout: default
title: Solutions
parent: Week 4 - Design Patterns & Clean Architecture
nav_order: 5
---

# ✅ Week 4 – Reference Solution

This solution demonstrates:

- Factory Pattern
- Strategy Pattern
- DTO Pattern
- Layered Architecture

The implementation is simplified for learning purposes.

---

# 📦 Suggested Package Structure

```
com.example.shop
│
├── controller
├── service
├── repository
├── model
├── dto
├── factory
└── strategy
```

---

# 1️⃣ Model Layer

## Product.java

```java
package model;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
```

---

# 2️⃣ Factory Pattern

## ProductFactory.java

```java
package factory;

import model.Product;

public class ProductFactory {

    public static Product createProduct(String type) {

        if (type.equalsIgnoreCase("book")) {
            return new Product("Book", 500);
        } 
        else if (type.equalsIgnoreCase("laptop")) {
            return new Product("Laptop", 50000);
        }

        throw new IllegalArgumentException("Invalid product type");
    }
}
```

✅ Client does not directly use `new Product()`.

---

# 3️⃣ Repository Layer

## CartRepository.java

```java
package repository;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class CartRepository {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
```

---

# 4️⃣ Strategy Pattern

## DiscountStrategy.java

```java
package strategy;

public interface DiscountStrategy {
    double applyDiscount(double amount);
}
```

---

## NoDiscount.java

```java
package strategy;

public class NoDiscount implements DiscountStrategy {

    public double applyDiscount(double amount) {
        return amount;
    }
}
```

---

## SeasonalDiscount.java

```java
package strategy;

public class SeasonalDiscount implements DiscountStrategy {

    public double applyDiscount(double amount) {
        return amount * 0.9; // 10% discount
    }
}
```

---

# 5️⃣ DTO Pattern

## OrderSummaryDTO.java

```java
package dto;

import java.util.List;

public class OrderSummaryDTO {

    private List<String> productNames;
    private double totalAmount;
    private double finalAmount;

    public OrderSummaryDTO(List<String> productNames,
                           double totalAmount,
                           double finalAmount) {
        this.productNames = productNames;
        this.totalAmount = totalAmount;
        this.finalAmount = finalAmount;
    }

    public List<String> getProductNames() {
        return productNames;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
}
```

✅ DTO hides internal Product structure.

---

# 6️⃣ Service Layer

## CartService.java

```java
package service;

import model.Product;
import repository.CartRepository;
import strategy.DiscountStrategy;
import dto.OrderSummaryDTO;

import java.util.List;
import java.util.stream.Collectors;

public class CartService {

    private CartRepository repository;
    private DiscountStrategy discountStrategy;

    public CartService(CartRepository repository,
                       DiscountStrategy discountStrategy) {
        this.repository = repository;
        this.discountStrategy = discountStrategy;
    }

    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    public OrderSummaryDTO checkout() {

        List<Product> products = repository.getProducts();

        double total = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        double finalAmount = discountStrategy.applyDiscount(total);

        List<String> names = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        return new OrderSummaryDTO(names, total, finalAmount);
    }
}
```

✅ Business logic lives here  
✅ Discount strategy applied here  

---

# 7️⃣ Controller Layer

## CartController.java

```java
package controller;

import factory.ProductFactory;
import repository.CartRepository;
import service.CartService;
import strategy.SeasonalDiscount;
import dto.OrderSummaryDTO;

public class CartController {

    public static void main(String[] args) {

        CartRepository repository = new CartRepository();
        CartService service = new CartService(
                repository,
                new SeasonalDiscount()
        );

        service.addProduct(ProductFactory.createProduct("book"));
        service.addProduct(ProductFactory.createProduct("laptop"));

        OrderSummaryDTO summary = service.checkout();

        System.out.println("Products: " + summary.getProductNames());
        System.out.println("Total: " + summary.getTotalAmount());
        System.out.println("Final Amount: " + summary.getFinalAmount());
    }
}
```

✅ Controller only coordinates  
✅ No business logic here  

---

# ✅ What This Solution Demonstrates

✔ Clear separation of layers  
✔ Proper use of Strategy  
✔ Factory for object creation  
✔ DTO for safe data transfer  
✔ Clean and readable structure  

---

# 🧠 Key Learning Points

- Patterns should reduce complexity, not increase it.
- Each class should have one responsibility.
- Avoid tight coupling between layers.
- Structure matters as much as logic.

---

# ⚠ Note

This is a reference solution.

There are many correct implementations.  
Focus on:

- Clean structure  
- Clear responsibilities  
- Simplicity  

Clean architecture > clever tricks.
