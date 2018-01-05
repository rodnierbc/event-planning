package models;

import java.util.List;

public class Birthday extends Event {
    private double birthdayCake;
    private double show;

    public Birthday(int numberGuests, List<Food> food, List<Beverages> beverages, double birthdayCake, double show) {
        super(numberGuests, food, beverages);
        this.birthdayCake = birthdayCake;
        this.show = show;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + birthdayCake + show;
    }
}
