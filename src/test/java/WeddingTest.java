import models.Beverages;
import models.Food;
import models.Wedding;
import org.junit.*;
import models.Event;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class WeddingTest {

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

}
