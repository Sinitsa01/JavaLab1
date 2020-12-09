package bsu.rfe.java.group6.lab1.SINITSA.var6B;

import java.util.ArrayList;
import java.util.List;

public class  MainApplication {
    public static void main(String[] args) throws Exception {

        Cheese cheese = new Cheese();

        Coffee сoffeeSaturated = new Coffee("насыщенный");
        Coffee сoffeeBitter = new Coffee("горький");
        Coffee сoffeeEastern = new Coffee("восточный");

        Apple appleSmall = new Apple("малый");
        Apple appleMiddle = new Apple("средний");
        Apple appleBid = new Apple("большой");

        List<Food> foodList = new ArrayList<>(20);

        for (String arg : args) {
            switch (arg) {
                case "-calories":
                    if (foodList.isEmpty()) {
                        System.out.println("Нет продуктов в корзине(Каллорийность 0)");
                    } else {
                        int calories = foodList.stream().map(Nutritious::calculateCalories).
                                mapToInt(Integer::intValue).sum();
                        System.out.println("Колличество каллорий: " + calories);
                    }
                    continue;

                case "-sort": foodList.sort((o1,o2)->o1.calculateCalories() - o2.calculateCalories());
                    continue;
            }
            String[] parts = arg.split("/");
            switch (parts[0]) {
            case "Cheese":
                foodList.add(new Cheese());
                break;
            case "Apple":
                foodList.add(new Apple(parts[1]));
                break;
            case "Coffee":
                foodList.add(new Coffee(parts[1]));
                break;
            default:
                System.out.println("Такого продукта нет");
                }
        }
        int appleSmallCount = 0;
        int appleMiddleCount = 0;
        int appleBigCount = 0;
        int cheesCount = 0;
        int сoffeeSaturatedCount = 0;
        int сoffeeBitterCount = 0;
        int сoffeeEasternCount = 0;
     
        for (int i =0 ; i < foodList.size(); i++){
            if (cheese.equals(foodList.get(i))){
                cheesCount++;
            }
            if (appleSmall.equals(foodList.get(i))){
                appleSmallCount++;
            }
            if (appleMiddle.equals(foodList.get(i))){
                appleMiddleCount++;
            }
            if (appleBid.equals(foodList.get(i))){
                appleBigCount++;
            }
            if (сoffeeSaturated.equals(foodList.get(i))){
            	сoffeeSaturatedCount++;
            }
            if (сoffeeBitter.equals(foodList.get(i))){
            	сoffeeBitterCount++;
            }
            if (сoffeeEastern.equals(foodList.get(i))){
            	сoffeeEasternCount++;
            }
            
        }

        for (Food item : foodList) {
            if (item != null) {
                item.consume();
            } else
                break;
        }
        if (cheesCount > 0)       System.out.println("Мы съели Сыр в количестве " + cheesCount );
        if (appleBigCount > 0)    System.out.println("Мы съели Яблоко размером БОЛЬШОЙ в количестве " + appleBigCount );
        if (appleMiddleCount > 0) System.out.println("Мы съели Яблоко размером СРЕДНИЙ в количестве " + appleMiddleCount );
        if (appleSmallCount > 0)  System.out.println("Мы съели Яблоко размером МАЛЫЙ в количестве " + appleSmallCount );
        if (сoffeeSaturatedCount > 0)   System.out.println("Мы выпили Кофе аромат НАСЫЩЕННЫЙ в количестве " + сoffeeSaturatedCount );
        if (сoffeeBitterCount > 0)   System.out.println("Мы выпили Кофе аромат ГОРЬКИЙ в количестве " + сoffeeBitterCount );
        if (сoffeeEasternCount > 0)   System.out.println("Мы выпили Кофе аромат ВОСТОЧНЫЙ в количестве " + сoffeeEasternCount );

        System.out.println("Всего хорошего!");
        }
    }

