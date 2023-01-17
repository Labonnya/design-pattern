package Drink;

public abstract class Drink {
    public Drink(DrinkType beverage) {
        this.beverage = beverage;
        makeDrink();
    }

    private void makeDrink() {

    }

    //Do sub-class level processing here
    protected abstract DrinkType construct();

    private DrinkType beverage = null;

    public DrinkType getBeverage() {
        return beverage;
    }

    public void setBeverage(DrinkType beverage) {
        this.beverage = beverage;
    }
}
