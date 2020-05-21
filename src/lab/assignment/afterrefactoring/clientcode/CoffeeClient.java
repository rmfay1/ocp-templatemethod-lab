package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.Americano;
import lab.assignment.afterrefactoring.Capuccino;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.CoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new Capuccino();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        CoffeeMaker starblast = new Mocha();
        starblast.prepareCoffee();

        System.out.println("********************");

        CoffeeMaker starbust = new Americano();
        starbust.prepareCoffee();

    }

}
