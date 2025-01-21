package automation.arraylist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeekdaysTest {
    @Test
    public void monday(){
        Weekdays weekdays = new Weekdays();
        assertEquals("Monday",weekdays.dayOfWeek(1));
    }

    @Test
    public void TestOfArrayList(){
        Weekdays weekdays = new Weekdays();
        assertEquals("Monday",weekdays.dayOfWeekArrayList(1));
        assertEquals("Wednesday",weekdays.dayOfWeekArrayList(3));
    }


}
