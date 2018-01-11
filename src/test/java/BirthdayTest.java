import models.*;
import org.junit.*;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class BirthdayTest {

    @Test
    public void newBirthday_instantiatesCorrectly() {
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

        Birthday testBirthday = new Birthday(100,food, beverages, 49.99, 60);
        assertTrue(testBirthday instanceof Birthday);
    }
    @Test
    public void Birthday_calculatePrice_double() {
        List<Food> food = new ArrayList<Food>();
        Food foodItem = new Food("rice", 2);
        food.add(foodItem);
        List<Beverages> beverages = new ArrayList<Beverages>();
        Beverages beveragesItem = new Beverages("Soda", 1);
        beverages.add(beveragesItem);
        Birthday testBirthday = new Birthday(100,food, beverages, 50, 60);
        double expectedOutput = 100*(2 + 1) + 50 + 60;
        assertEquals(expectedOutput, testBirthday.calculatePrice(), 410.0);
    }

}
