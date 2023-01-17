package Drink;

public class Coke extends Drink{
    Coke() {
        super(DrinkType.COKE);
        construct();
    }

    protected void construct() {
        System.out.println("Serving Coke");
    }
}
