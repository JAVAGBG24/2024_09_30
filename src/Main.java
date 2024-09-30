import java.util.Arrays;

record Item(String name, String type, int amount) {
    public Item(String name) {
        this(name, "DAIRY", 1);
    }
}

public class Main {
    public static void main(String[] args) {
        //Object[] shoppingArray = new Object[3];

        Item[] shoppingArray = new Item[3];

        shoppingArray[0] = new Item("milk");
        shoppingArray[1] = new Item("tomatoes", "VEGETABLES", 2);
        //shoppingArray[2] = "2 apples";
        shoppingArray[2] = new Item("apples", "FRUIT", 2);

        System.out.println(Arrays.toString(shoppingArray));


    }
}