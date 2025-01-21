package automation.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Weekdays {

    private String[] weekdaysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String dayOfWeek(int day) {
        return weekdaysArray[day - 1];
    }

    // Datastrukturer
    // Array bokar upp ett antal defienierade minnesplatser med bestämd storlek, tex String, int long....
    // ArrayList kan lägga till nya och ta bort poster lite mer dynamisk men snabb att söka i men långsam att lägga till/ta bort
    // LinkedList som Arraylist men snabb att lägga till och ta bort men långsammare att söka i
    // Hashmap (Register)
    // Stack (Tallrikar, First in last our)
    // Queue ( Kö först in i kön kommer först ut)
    // Tree
    private ArrayList<String> weekdaysArrayList = new ArrayList<>(Arrays.asList("Monday","Tuesday"));
    Weekdays() {
        weekdaysArrayList.add("Wednesday");
    }

    public String dayOfWeekArrayList(int day) {
        return weekdaysArrayList.get(day-1);
    }

}
