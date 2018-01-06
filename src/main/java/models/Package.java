package models;

public class Package {//
    private Event event;
    private double discountPercentage;

    public Package(Event event, double discountPercentage){
        this.event = event;
        this.discountPercentage = discountPercentage;
    }
}
