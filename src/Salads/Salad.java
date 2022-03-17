package Salads;

import Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Salad {
    private String nameOfSalad;
    private int numberOfIngredients;
    private ArrayList<Vegetable> ingredients;
    private double totalCallories;

    public Salad(String nameOfSalad, int numberOfIngredients) {
        this.nameOfSalad = nameOfSalad;
        this.ingredients = new ArrayList<>(numberOfIngredients);
        this.numberOfIngredients = numberOfIngredients;
        totalCallories = 0;
    }

    public double getTotalCallories() {
        return totalCallories;
    }

    public void setTotalCallories(double totalCallories) {
        this.totalCallories = totalCallories;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    public ArrayList<Vegetable> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Vegetable... v) {
        if (v.length > numberOfIngredients) {
            System.out.println("Превышено количество добавляемых продуктов");
        } else {
            Collections.addAll(ingredients, v);
        }
    }

    @Override
    public String toString() {
        return "'" + nameOfSalad + '\'' +
                ", number Of Ingredients= " + numberOfIngredients +
                ", ingredients=" + ingredients +
                ", totalCallories=" + totalCallories;
    }
}
