/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pay.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.pay.entities.Direction;
import mx.itson.pay.entities.NutritionFact;
import mx.itson.pay.entities.Recipe;
import mx.itson.pay.entities.User;
import mx.itson.pay.enums.Difficulty;

/**
 *
 * @author avalo
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Egla Avalos");
        user.setEmail("ela_thv23@gmail.com");
        user.setPassword("kuromi_sanrio");

        List<String> ingredients = new ArrayList<>();
        ingredients.add("1 Paquete Galletas Marías molidas");
        ingredients.add("1 Barra Mantequilla derretida (90 g)");
        ingredients.add("3 Sobres Grenetina (7 g c/u)hidratada en 1/4 de taza de agua (60 ml) y disuelta");
        ingredients.add("1 Lata Leche Evaporada CARNATION CLAVEL en Balance Reducida en Grasa");
        ingredients.add("1 Lata LA LECHERA en Balance Sin Grasa");
        ingredients.add("2 Paquetes Queso crema (190 g c/u)");

        Direction d1 = new Direction();
        d1.setStep(1);
        d1.setDescription("Mezcla las galletas molidas con la mantequilla hasta formar una pasta; colócala en un molde para pay previamante engrasado y refrigera por 15 minutos.");
        Direction d2 = new Direction();
        d2.setStep(2);
        d2.setDescription("Licúa la Leche Evaporada CARNATION CLAVEL con la Leche Condensada LA LECHERA, el queso crema y la grenetina previamente disuelta.");
        Direction d3 = new Direction();
        d3.setStep(3);
        d3.setDescription("Vierte en el molde para pay y refrigera durante 15 minutos; desmolda y ofrece.");

        List<Direction> direction = new ArrayList();
        direction.add(d1);
        direction.add(d2);
        direction.add(d3);

        NutritionFact v1 = new NutritionFact();
        v1.setName("Carbohidratos ");
        v1.setValue("50.1 g");
        NutritionFact v2 = new NutritionFact();
        v2.setName("Energía");
        v2.setValue("526.7 kcal");
        NutritionFact v3 = new NutritionFact();
        v3.setName("Grasas");
        v3.setValue("30.9 g");
        NutritionFact v4 = new NutritionFact();
        v4.setName("Fibra");
        v4.setValue("0.7 g");
        NutritionFact v5 = new NutritionFact();
        v5.setName("Proteinas");
        v5.setValue("13.3 g.");
        NutritionFact v6 = new NutritionFact();
        v6.setName("Grasa Saturada");
        v6.setValue("18.5 g");
        NutritionFact v7 = new NutritionFact();
        v7.setName("Sodio");
        v7.setValue("324.7 mg");
        NutritionFact v8 = new NutritionFact();
        v8.setName("Azúcares");
        v8.setValue("38.8 g");

        List<NutritionFact> nutritionFacts = new ArrayList<>();
        nutritionFacts.add(v1);
        nutritionFacts.add(v2);
        nutritionFacts.add(v3);
        nutritionFacts.add(v4);
        nutritionFacts.add(v5);
        nutritionFacts.add(v6);
        nutritionFacts.add(v7);
        nutritionFacts.add(v8);

        Recipe recipe1 = new Recipe();
        recipe1.setName("Pay de queso frio");
        recipe1.setDescription("Prepara un PAY FRÍO DE QUESO con LA LECHERA");
        recipe1.setIngredients(ingredients);
        recipe1.setDirections(direction);
        recipe1.setTime(57);
        recipe1.setServings(8);
        recipe1.setUser(user);
        recipe1.setDifficulty(Difficulty.EASY);
        recipe1.setUser(user);
        recipe1.setIngredients(ingredients);

        System.out.println("-------------------------------------------");
        System.out.println("USUARIO " + recipe1.getUser().getName());
        System.out.println("RECETA DE " + recipe1.getName().toUpperCase());
        System.out.println("DESCRIPCIÓN: " + "\n" + recipe1.getDescription());
        System.out.println("INGREDIENTES: " + "\n" + recipe1.getIngredients().get(0)
                + "\n" + recipe1.getIngredients().get(1)
                + "\n" + recipe1.getIngredients().get(2)
                + "\n" + recipe1.getIngredients().get(3)
                + "\n" + recipe1.getIngredients().get(4)
                + "\n" + recipe1.getIngredients().get(5));
        System.out.println(" ");
        System.out.println("PORCIONES "
                + "\n " + recipe1.getServings());
        System.out.println(" ");
        System.out.println("TIEMPO DE PREPARACION: "
                + "\n" + recipe1.getTime() + " Minutos");
        System.out.println(" ");
        System.out.println("DIFICULTAD " + "\n" + recipe1.getDifficulty());
        System.out.println(" ");
        System.out.println("PASOS: "
                + "\n" + d1.getStep() + " " + d1.getDescription()
                + "\n" + d2.getStep() + " " + d2.getDescription()
                + "\n" + d3.getStep() + " " + d3.getDescription());
        System.out.println(" ");
        System.out.println("INFORMACIÓN NUTRICIONAL: "
                + "\n" + v1.getName() + " " + v1.getValue()
                + "\n" + v2.getName() + " " + v2.getValue()
                + "\n" + v3.getName() + " " + v3.getValue()
                + "\n" + v4.getName() + " " + v4.getValue()
                + "\n" + v5.getName() + " " + v5.getValue()
                + "\n" + v6.getName() + " " + v6.getValue()
                + "\n" + v7.getName() + " " + v7.getValue()
                + "\n" + v8.getName() + " " + v8.getValue());
        System.out.println("-------------------------------------------");
        
    }
}
