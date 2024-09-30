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
        System.out.println("Added: " + order.toString());
    }

    public BigDecimal calculateTotal() {
        return orders.stream()
                .map(Order::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

       /* double total = 0;
        for (restaurant.Order order : orders) {
            total += order.getPrice();
        }
        return total;*/

    }

    public List<Order> getOrders() {
        return orders;
    }


    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
        } else {
            for (Order order : orders) {
                System.out.println(order.toString());
            }
        }
    }


}

