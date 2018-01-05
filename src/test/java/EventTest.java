import models.Beverages;
import models.Food;
import org.junit.*;
import models.Event;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newHangman_instantiatesCorrectly() {
        List<Food> food = new ArrayList<Food>();
        for(int i =0; i<5; i++){
            Food foodItem = new Food("rice", 2.99);
            food.add(foodItem);
        }
        List<Beverages> beverages = new ArrayList<Beverages>();
        for(int i =0; i<5; i++){
            Beverages beveragesItem = new Beverages("Soda", 0.99);
            beverages.add(beveragesItem);
        }

        Event testEvent = new Event(100,food, beverages);
        assertTrue(testEvent instanceof Event);
    }
}
