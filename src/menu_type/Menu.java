package menu_type;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private MenuType menuType;
    private List<String> dishes;

    public Menu(MenuType menuType) {
        this.menuType = menuType;
        this.dishes = new ArrayList<>();
    }

    public void addDish(String dish) {
        dishes.add(dish);
    }

    public void printMenuDetails() {
        System.out.println("Menu: " + menuType);
        System.out.println("Time: " + menuType.getStartTime() + " - " + menuType.getEndTime());
        System.out.println("Dishes:");
        for (String dish : dishes) {
            System.out.println("- " + dish);
        }
    }
}
