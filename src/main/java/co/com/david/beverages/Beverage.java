package co.com.david.beverages;

public abstract class Beverage {

    String description = "Uknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

}
