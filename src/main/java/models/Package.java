package models;

public class Package {//
    private Event event;
    private double discountPercentage;

    public Package(Event event, double discountPercentage){
        this.event = event;
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public Event getEvent() {
        return event;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    
}
