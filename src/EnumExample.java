import java.util.Random;

public class EnumExample {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.WED;
        //System.out.println(weekDay);

        //System.out.printf("Weekday is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Weekday is %s, Ordnial value = %d%n", weekDay.name(), weekDay.ordinal());

            if (weekDay == WeekDay.SAT) {
                System.out.println("Yay! It's Saturday!");
            }
        }
    }

    public static WeekDay getRandomDay() {
        int rand = new Random().nextInt(7);

        var week = WeekDay.values();

        return week[rand];
    }
}
