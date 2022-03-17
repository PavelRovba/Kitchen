package Vegetables;

public class Cabbage extends Vegetable {
    private static final int CABBAGE_KILOCALORIES_PER_HUNDRED_GRAMS = 28;

    public Cabbage(double weight) {
        super(weight, CABBAGE_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCallories() {
        return super.countKiloCallories();
    }

    @Override
    public String toString() {
        return "Cabbage: " + super.toString();
    }
}
