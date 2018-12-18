package co.com.david.decorator;

import co.com.david.beverages.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        double costBySize = 0;
        switch (this.getSize()) {
            case TALL:
                costBySize = .20;
                break;
            case GRANDE:
                costBySize = .15;
                break;
            case VENTI:
                costBySize = .10;
                break;

            default:
                costBySize = .10;
                break;
        }
        return this.beverage.cost() + costBySize;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
