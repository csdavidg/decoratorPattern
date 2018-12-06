package co.com.david.decorator;

import co.com.david.beverages.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + .10;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
