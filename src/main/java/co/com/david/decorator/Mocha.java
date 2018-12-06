package co.com.david.decorator;

import co.com.david.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + .20;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
