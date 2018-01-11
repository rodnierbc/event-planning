import models.Beverages;
import models.Food;
import models.Wedding;
import org.junit.*;
import models.Event;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class FoodTest {

    @Test
    public void newFood_instantiatesCorrectly() {
        Food testFood = new Food("rice", 2.99);
        assertTrue(testFood instanceof Food);
    }
}
