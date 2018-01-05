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
    public void newWedding_instantiatesCorrectly() {
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

        Wedding testWedding = new Wedding(100,food, beverages, 49.99, 60, 0);
        assertTrue(testWedding instanceof Wedding);
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
    public void Wedding_calculatePrice_double() {
        List<Food> food = new ArrayList<Food>();
        Food foodItem = new Food("rice", 2);
        food.add(foodItem);
        List<Beverages> beverages = new ArrayList<Beverages>();
        Beverages beveragesItem = new Beverages("Soda", 1);
        beverages.add(beveragesItem);
        Wedding testWedding = new Wedding(100,food, beverages, 50, 60, 500);
        double expectedOutput = 100*(2 + 1) + 50 + 60 + 500;
        assertEquals(expectedOutput, testWedding.calculatePrice(), 910.0);
    }

    @Test
    public void Food_filterFood_List_Food() {
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
}
