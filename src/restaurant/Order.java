package restaurant;

public class Order {
    private String dishName;
    private int tableNumber;
    private double price;


    public Order(String dishName, int tableNumber, double price) {
        this.dishName = dishName;
        this.tableNumber = tableNumber;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Table " + tableNumber + ": " + dishName + " " + price + " SEK";
    }
}

