package Drink;

public class Sprite extends Drink{
    Sprite() {
        super(DrinkType.SPRITE);
        construct();
    }

    protected void construct() {
        System.out.println("Serving Sprite");
    }
}
