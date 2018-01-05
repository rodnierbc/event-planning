import models.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Food bakedChicken = new Food("Baked Chicken", 3.0);
            Food pizza = new Food("Pizza", 1.99);
            Food fruitSalad = new Food("Fruit Salad", 0.99);
            List<Food> foods= new ArrayList<Food>();
            foods.add(bakedChicken);
            foods.add(pizza);
            foods.add(fruitSalad);

            Beverages coffee = new Beverages("Regular Coffee", 1.5);
            Beverages soda = new Beverages("Soda", 1.99);
            Beverages fruitJuice = new Beverages("Fruit Juice", 2.99);
            List<Beverages> beverages= new ArrayList<Beverages>();
            beverages.add(coffee);
            beverages.add(soda);
            beverages.add(fruitJuice);

            System.out.println("Are you ready to set up the event you want our company to do?, enter (YES) or (NOT) to continue");
            String nextStep = bufferedReader.readLine().toUpperCase();
            if(nextStep.equals("YES")){
                System.out.println("Enter the type of event you want to do");
                System.out.println("for Wedding enter (W), for Birthday enter (B), for Reunion Celebration enter (R)");
                String eventType = bufferedReader.readLine().toUpperCase();
                //Number of Guests
                System.out.println("Enter the number of guests");
                int numberGuests = Integer.parseInt(bufferedReader.readLine());
                //Foods selection
                System.out.println("From the following list select the types of meals you want in your buffet, enter a sequence of numbers that match each item");
                for (int i = 1; i <= foods.size(); i++){
                    System.out.println(i+" - "+foods.get(i-1).getName()+" $"+foods.get(i-1).getPrice());
                }
                String foodSelection = bufferedReader.readLine();
                //Beverages selection
                System.out.println("From the following list select the types of beverages you want in your buffet, enter a sequence of numbers that match each item");
                for (int i = 1; i <= beverages.size(); i++){
                    System.out.println(i+" - "+beverages.get(i-1).getName()+" $"+beverages.get(i-1).getPrice());
                }
                String beveragesSelection = bufferedReader.readLine();
            }
            else {
                System.out.println("");
            }
            System.out.println("You can check some of the packages we have available!!!");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }



}
