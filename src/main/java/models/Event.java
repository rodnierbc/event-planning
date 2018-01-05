package models;

import java.util.List;

public class Event {
    private int numberGuests;
    private List<Food> food;
    private List<Beverages> beverages;
    private double basePrice;

    public Event(int numberGuests, List<Food> food, List<Beverages> beverages){
        this.numberGuests = numberGuests;
        this.food = food;
        this.beverages = beverages;
    }
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
}
