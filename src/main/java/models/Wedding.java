package models;

import java.util.List;

public class Wedding extends Event {
    //for now the weddingDress, weddingCake musicBand fields are going to be doubles type that represent the price of including them in the event but in the future they will be objects
    private double weddingCake;
    private double weddingDress;
    private double musicBand;
    private double price;

    public Wedding(int numberGuests, List<Food> food, List<Beverages> beverages, double weddingCake, double weddingDress, double musicBand) {
        super(numberGuests, food, beverages);
        this.weddingCake = weddingCake;
        this.musicBand = musicBand;
        this.weddingDress =weddingDress;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + weddingDress + musicBand + weddingCake;
    }
}
