package Main;

import Salads.Salad;
import Vegetables.Vegetable;


import java.util.*;

public class Cooker {
    static Salad makeSalad(String name, int numberOfIngredients) {
        Salad salad = new Salad(name, numberOfIngredients);
        return salad;
    }

    ;

    static void countCallories(Salad salad) {
        double total = salad.getTotalCallories();
        ArrayList<Vegetable> ingredients = salad.getIngredients();
        for (Vegetable s : ingredients) salad.setTotalCallories(total += s.countKiloCallories());
        System.out.println(total);
    }

    static void addVegetableOil(Salad salad, double weight) {
        double total = salad.getTotalCallories() + weight * 8.84;
        salad.setTotalCallories(total);
    }

    static void sortByCallories(Salad salad) {
        ArrayList<Vegetable> ingredients = salad.getIngredients();
        ingredients.sort(new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable v1, Vegetable v2) {
                return (int) (v1.getKiloCallories() - v2.getKiloCallories());
            }
        });
        System.out.println(ingredients.toString());
    }

    static void sortByWeight(Salad salad) {
        ArrayList<Vegetable> ingredients = salad.getIngredients();
        ingredients.sort(new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable v1, Vegetable v2) {
                return (int) (v1.getWeight() - v2.getWeight());
            }
        });
        System.out.println(ingredients.toString());
    }
}
