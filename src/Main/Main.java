package Main;

import Salads.Salad;
import Vegetables.*;


public class Main {
    public static void main(String[] args) {
        Salad salad = Cooker.makeSalad("Vegetable Salad",5);
        salad.setIngredients(new Onion(250),new Tomato(200),new Cucumber(300),new Pepper(150),new Cabbage(300));
        Cooker.addVegetableOil(salad,10);
        Cooker.countCallories(salad);
        System.out.println(salad.toString());
        Cooker.sortByCallories(salad);
        Cooker.sortByWeight(salad);

    }
}
