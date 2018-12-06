package co.com.david.decorator;

import co.com.david.beverages.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + .15;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
