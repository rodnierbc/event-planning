import models.Beverages;
import models.Food;
import models.Wedding;
import org.junit.*;
import models.Event;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly() {
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
    @Test
    public void Event_calculatePrice_double() {
        List<Food> food = new ArrayList<Food>();
        Food foodItem = new Food("rice", 2);
        food.add(foodItem);
        List<Beverages> beverages = new ArrayList<Beverages>();
        Beverages beveragesItem = new Beverages("Soda", 1);
        beverages.add(beveragesItem);
        Event testEvent = new Event(100,food, beverages);
        double expectedOutput = 100*(2 + 1);
        assertEquals(expectedOutput, testEvent.calculatePrice(), 300.0);
    }
    @Test
    public void Event_filterFood_List_Food() {
        List<Beverages> beverages = new ArrayList<Beverages>();
        List<Food> foods = new ArrayList<Food>();
        Food foodItem1 = new Food("rice", 2.99);
        Food foodItem2 = new Food("potatoes", 3.99);
        Food foodItem3 = new Food("salad", 4.99);
        foods.add(foodItem1);
        foods.add(foodItem2);
        foods.add(foodItem3);
        List<Food> expectedOutput = new ArrayList<Food>();
        expectedOutput.add(foodItem1);
        expectedOutput.add(foodItem3);
        Event testEvent = new Event(100,foods,beverages);
        assertEquals(expectedOutput, testEvent.filterFood("13", foods));
    }
    @Test
    public void Event_filterBeverages_List_Beverages() {
        List<Beverages> beverages = new ArrayList<Beverages>();
        List<Food> foods = new ArrayList<Food>();
        Beverages beveragesItem1 = new Beverages("soda1", 2.99);
        Beverages beveragesItem2 = new Beverages("soda2", 3.99);
        beverages.add(beveragesItem1);
        beverages.add(beveragesItem2);
        List<Beverages> expectedOutput = new ArrayList<Beverages>();
        expectedOutput.add(beveragesItem1);
        Event testEvent = new Event(100,foods,beverages);
        assertEquals(expectedOutput, testEvent.filterBeverages("1", beverages));
    }

}
