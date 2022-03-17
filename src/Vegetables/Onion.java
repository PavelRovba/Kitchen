package Vegetables;

public class Onion extends Vegetable{
    private static final int ONION_KILOCALORIES_PER_HUNDRED_GRAMS = 43;
    public Onion(double weight) {
        super(weight,ONION_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCallories() {
        return super.countKiloCallories();
    }

    @Override
    public String toString() {
        return "Onion: " + super.toString();
    }
}
