package models;

import java.util.List;

public class ReunionCelebrations extends Event{
    private double djEntertainment;
    private List<Drink> drinks;
    public ReunionCelebrations(int numberGuests, List<Food> food, List<Beverages> beverages, double djEntertainment, List<Drink> drinks) {
        super(numberGuests, food, beverages);
        this.djEntertainment = djEntertainment;
        this.drinks = drinks;
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice() + djEntertainment;
        for(Drink drinkItem : drinks){
            price += drinkItem.getPrice();
        }
        return price;
    }
}
