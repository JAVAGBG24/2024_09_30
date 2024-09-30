package restaurant;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Order> orders;

    public Restaurant() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Added: " + order.toString());
    }

    public double calculateTotal() {
        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
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


