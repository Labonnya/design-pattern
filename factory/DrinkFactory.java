package Drink;

public class DrinkFactory {
    public static Drink create(DrinkType beverage) {
        Drink drink = null;
        switch (beverage) {
            case COKE:
                drink = new Coke();
                break;

            case FANTA:
                drink = new Fanta();
                break;

            case SPRITE:
                drink = new Sprite();
                break;

            default:
                //throw some exception
                break;
        }
        return drink;
    }
}
