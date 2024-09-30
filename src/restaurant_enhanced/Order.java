package restaurant_enhanced;

import java.math.BigDecimal;

public class Order {
    private final String dishName;
    private final int tableNumber;
    private final BigDecimal price;

    public Order(String dishName, int tableNumber, BigDecimal price) {
        // se till att man inte får skapa order om tableNr är mindre än eller = 0
        if (tableNumber <= 0) {
            throw new IllegalArgumentException("Table number must be positive.");
        }

        // kolla så att price inte är negativt tal
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price must be non-negative.");
        }

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

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Table " + tableNumber + ": " + dishName + " " + price + " SEK";
    }

}

