/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pay.entities;

import java.util.List;
import mx.itson.pay.enums.Difficulty;

/**
 *
 * @author avalo
 */
public class Recipe {
    
    private String name;
    private String description;
    private User user;
    private List <String> ingredients;
    private List <Direction> directions;
    private int time;
    private int servings;
    private Difficulty difficulty;
    private List <NutritionFact> nutritionFacts;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the ingredients
     */
    public List <String> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List <String> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the directions
     */
    public List <Direction> getDirections() {
        return directions;
    }

    /**
     * @param directions the directions to set
     */
    public void setDirections(List <Direction> directions) {
        this.directions = directions;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * @return the difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the nutritionFacts
     */
    public List <NutritionFact> getNutritionFacts() {
        return nutritionFacts;
    }

    /**
     * @param nutritionFacts the nutritionFacts to set
     */
    public void setNutritionFacts(List <NutritionFact> nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }
    
}
