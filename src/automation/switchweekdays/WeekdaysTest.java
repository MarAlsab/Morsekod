package automation.switchweekdays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeekdaysTest {
    @Test
    public void gwtWeekdayTest(){
        assertEquals("Monday",Weekdays.getWeekday(1));
        assertEquals("Tuesday",Weekdays.getWeekday(2));
        assertEquals("",Weekdays.getWeekday(9));
    }

}
