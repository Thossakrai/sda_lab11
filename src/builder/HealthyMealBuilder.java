package builder;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boonjv
 */
public class HealthyMealBuilder extends MealBuilder {

    @Override
    void buildEntree() {
        theMeal.setEntree("chicken sandwich");
    }

    @Override
    void buildSideDish() {
        theMeal.setSide("carrot sticks");
    }

    @Override
    void buildDrink() {
        theMeal.setDrink("diet cole");
    }
}
