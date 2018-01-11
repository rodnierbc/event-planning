import models.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ReunionClelebrationTest {

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
        List<Drink> drinks = new ArrayList<Drink>();
        for(int i =0; i<5; i++){
            Drink drinkItem = new Drink("Soda", 0.99);
            drinks.add(drinkItem);
        }

        ReunionCelebrations testReunionCelebration = new ReunionCelebrations(100,food, beverages, 49.99, drinks);
        assertTrue(testReunionCelebration instanceof ReunionCelebrations);
    }
    @Test
    public void ReunionCelebration_calculatePrice_double() {
        List<Food> food = new ArrayList<Food>();
        Food foodItem = new Food("rice", 2);
        food.add(foodItem);
        List<Beverages> beverages = new ArrayList<Beverages>();
        Beverages beveragesItem = new Beverages("Soda", 1);
        beverages.add(beveragesItem);
        List<Drink> drinks = new ArrayList<>();
        Drink drink = new Drink("beer", 2.45);
        drinks.add(drink);
        ReunionCelebrations testReunionCelebrations = new ReunionCelebrations(100,food, beverages, 50,drinks);
        double expectedOutput = 100*(2 + 1) + 50 + 60 + 400;
        assertEquals(expectedOutput, testReunionCelebrations.calculatePrice(), 810.0);
    }
}
