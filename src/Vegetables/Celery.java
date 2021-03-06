package Vegetables;

public class Celery extends Vegetable {
    private static final int CELERY_KILOCALORIES_PER_HUNDRED_GRAMS = 13;

    public Celery(double weight) {
        super(weight, CELERY_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCallories() {
        return super.countKiloCallories();
    }

    @Override
    public String toString() {
        return "Celery " + super.toString();
    }
}
