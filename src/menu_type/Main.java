package menu_type;

public class Main {
    public static void main(String[] args) {
        Menu breakfastMenu = new Menu(MenuType.BREAKFAST);
        breakfastMenu.addDish("Pancakes");
        breakfastMenu.addDish("Scrambled eggs");
        breakfastMenu.addDish("Toast");

        Menu lunchMenu = new Menu(MenuType.LUNCH);
        lunchMenu.addDish("Chicken salad");
        lunchMenu.addDish("Chicke wrap");

        Menu dinnerMenu = new Menu(MenuType.DINNER);
        dinnerMenu.addDish("Steak with fries");

        breakfastMenu.printMenuDetails();
        System.out.println("--------------------------");
        lunchMenu.printMenuDetails();
        System.out.println("--------------------------");
        dinnerMenu.printMenuDetails();
    }
}
