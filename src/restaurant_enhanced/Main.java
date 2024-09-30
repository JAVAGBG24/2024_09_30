package restaurant_enhanced;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addOrder(new Order("Pasta Carbonara", 4, new BigDecimal("199.50")));
        restaurant.addOrder(new Order("Pizza", 2, new BigDecimal("149.90")));
        restaurant.addOrder(new Order("Ceaser Salad", 3, new BigDecimal("179.50")));
        restaurant.addOrder(new Order("Pizza", 4, new BigDecimal("149.50")));

        System.out.println("Current orders:");
        OrderPresenter.displayOrders(restaurant.getOrders());

        System.out.println("-----------------------------");

        BigDecimal total = restaurant.calculateTotal();
        OrderPresenter.displayTotalCost(total);

    }
}
