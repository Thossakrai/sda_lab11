package builder;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boonjv
 */
/** Abstract builder for the builder.Meal objects, supporting all the
 *  operations for building a meal.
 *
 * @author YOUR NAME HERE
 */
public abstract class MealBuilder {

  protected Meal theMeal;

  // Additional methods here
  abstract void buildEntree();
  abstract void buildSideDish();
  abstract void buildDrink();

  public Meal getMeal() {
    return theMeal;
  }

  public void createMeal() {
    theMeal = new Meal();
  }
}