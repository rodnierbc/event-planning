package models;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private int numberGuests;
    private List<Food> food;
    private List<Beverages> beverages;

    public Event(int numberGuests, List<Food> food, List<Beverages> beverages){
        this.numberGuests = numberGuests;
        this.food = food;
        this.beverages = beverages;
    }
    public Event(){};

    public double calculatePrice(){
        double price = 0;
        for (int i = 0; i<numberGuests; i++){
            for (Food foodItem: food){
                price += foodItem.getPrice();
            }
            for (Beverages beverageItem: beverages){
                price += beverageItem.getPrice();
            }
        }
        return price;
    }

    public List<Food> filterFood(String indexs, List<Food> foods){
        List<Food> foodsFiltered = new ArrayList<Food>();
        char[] indexsArray = indexs.toCharArray();
        for(char index : indexsArray){
            int index1 = Integer.parseInt(Character.toString(index))-1;
            foodsFiltered.add(foods.get(index1));
        }
        return foodsFiltered;
    }
    public List<Beverages> filterBeverages(String indexs, List<Beverages> beverages){
        List<Beverages> beveragesFiltered = new ArrayList<Beverages>();
        char[] indexsArray = indexs.toCharArray();
        for(char index : indexsArray){
            int index1 = Integer.parseInt(Character.toString(index))-1;
            beveragesFiltered.add(beverages.get(index1));
        }
        return beveragesFiltered;
    }

}
