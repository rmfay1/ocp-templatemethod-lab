package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.Capuccino;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.CoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new Capuccino();
        CoffeeMaker starblast = new Mocha();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starblast.prepareCoffee();

    }

}
