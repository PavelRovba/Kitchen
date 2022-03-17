package Vegetables;

public class Parsley extends Vegetable {
    private static final int PARSLEY_KILOCALORIES_PER_HUNDRED_GRAMS = 45;

    public Parsley(double weight) {
        super(weight, PARSLEY_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCallories() {
        return super.countKiloCallories();
    }

    @Override
    public String toString() {
        return "Parsley: " + super.toString();
    }
}
