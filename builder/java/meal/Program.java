package builder.java.meal;

import builder.java.meal.builder.FastFoodMealBuilder;
import builder.java.meal.model.FastFoodMeal;

public class Program {
    public static void main(String[] args) {

        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
            .andMain("CheeseBurger")
            .forDrink("Code")
            .build();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").build();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
            .andMain("Monster Burguer")
            .forDrink("Milk Shake")
            .andDessert("Fudge Cake")
            .andGift("2 Kilograms")
            .build();
        System.out.println(heartAtackCombo);
    }
}
