package restaurant_enhanced;

import java.math.BigDecimal;
import java.util.List;

public class OrderPresenter {
    // orderpresentatör som endast hanterar utskrift till konsolen

    // visa beställningar
    public static void displayOrders(List<Order> orders) {
        if(orders.isEmpty()) {
            System.out.println("No orders yet.");
        } else {
            for(Order order : orders) {
                System.out.println(order.toString());
            }
        }
    }

    // visa totala kostnaden
    public static void displayTotalCost(BigDecimal totalCost) {
        System.out.println("\nTotal cost: " + totalCost + " SEK");
    }
}
