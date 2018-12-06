package co.com.david;

import co.com.david.beverages.Beverage;
import co.com.david.beverages.DarkRoast;
import co.com.david.beverages.Espresso;
import co.com.david.beverages.HouseBlend;
import co.com.david.decorator.Mocha;
import co.com.david.decorator.Soy;
import co.com.david.decorator.Whip;

public class StarBuzzCoffeee {

    public static void main(String args[]) {

        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());


        Beverage beverage2 = new HouseBlend();

        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
    }

}
