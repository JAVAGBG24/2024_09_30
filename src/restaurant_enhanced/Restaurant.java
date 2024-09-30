package restaurant_enhanced;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Order> orders;

    public Restaurant() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Added: " + order);
    }

    public BigDecimal calculateTotal() {
        return orders.stream()
                .map(Order::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        /*
        Om vi skulle haft int istället för BigDecimal hade vi returnerat:
        return orders.stream()
                .mapToInt(Order::getPrice)
                .sum();
        */
    }

    public List<Order> getOrders() {
        return orders;
    }
}

