package restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addOrder(new Order("Pasta Carbonara", 3, 169.00));
        restaurant.addOrder(new Order("Margherita Pizza", 3, 149.00 ));
        restaurant.addOrder(new Order("Margherita Pizza", 1, 149.00));
        restaurant.addOrder(new Order("Caesar Salad", 2, 189.00));

        System.out.println("\nCurrent Orders:");
        restaurant.displayOrders();

        double total = restaurant.calculateTotal();
        System.out.println("\nTotal cost: " + total + " SEK");
    }
}