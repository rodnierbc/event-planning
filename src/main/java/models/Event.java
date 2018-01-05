package models;

import java.util.List;

public class Event {
    private int numberGuests;
    private List<String> food;
    private List<String> beverages;
    private double basePrice;

    public Event(int numberGuests, List<String> food, List<String> beverages){
        this.numberGuests = numberGuests;
        this.food = food;
        this.beverages = beverages;
        double price = 0;
        for (int i = 0; i<numberGuests; i++){
            price += food.size()*4.99 + beverages.size()*5.99;
        }
        this.basePrice= price;

    }
}
