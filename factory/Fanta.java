package Drink;

public class Fanta extends Drink{
    Fanta() {
        super(DrinkType.FANTA);
        construct();
    }

    protected void construct() {
        System.out.println("Serving Fanta");
    }
}
