package bsu.rfe.java.group6.lab1.SINITSA.var6B;

import java.util.ArrayList;
import java.util.List;

public class  MainApplication {
    public static void main(String[] args) throws Exception {

        Cheese cheese = new Cheese();

        Coffee ñoffeeSaturated = new Coffee("íàñûùåííûé");
        Coffee ñoffeeBitter = new Coffee("ãîğüêèé");
        Coffee ñoffeeEastern = new Coffee("âîñòî÷íûé");

        Apple appleSmall = new Apple("ìàëûé");
        Apple appleMiddle = new Apple("ñğåäíèé");
        Apple appleBid = new Apple("áîëüøîé");

        List<Food> foodList = new ArrayList<>(20);

        for (String arg : args) {
           
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
                System.out.println("Òàêîãî ïğîäóêòà íåò");
                }
        }
        int appleSmallCount = 0;
        int appleMiddleCount = 0;
        int appleBigCount = 0;
        int cheesCount = 0;
        int ñoffeeSaturatedCount = 0;
        int ñoffeeBitterCount = 0;
        int ñoffeeEasternCount = 0;
     
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
            if (ñoffeeSaturated.equals(foodList.get(i))){
            	ñoffeeSaturatedCount++;
            }
            if (ñoffeeBitter.equals(foodList.get(i))){
            	ñoffeeBitterCount++;
            }
            if (ñoffeeEastern.equals(foodList.get(i))){
            	ñoffeeEasternCount++;
            }
            
        }

        for (Food item : foodList) {
            if (item != null) {
                item.consume();
            } else
                break;
        }
        if (cheesCount > 0)       System.out.println("Ìû ñúåëè Ñûğ â êîëè÷åñòâå " + cheesCount );
        if (appleBigCount > 0)    System.out.println("Ìû ñúåëè ßáëîêî ğàçìåğîì ÁÎËÜØÎÉ â êîëè÷åñòâå " + appleBigCount );
        if (appleMiddleCount > 0) System.out.println("Ìû ñúåëè ßáëîêî ğàçìåğîì ÑĞÅÄÍÈÉ â êîëè÷åñòâå " + appleMiddleCount );
        if (appleSmallCount > 0)  System.out.println("Ìû ñúåëè ßáëîêî ğàçìåğîì ÌÀËÛÉ â êîëè÷åñòâå " + appleSmallCount );
        if (ñoffeeSaturatedCount > 0)   System.out.println("Ìû âûïèëè Êîôå àğîìàò ÍÀÑÛÙÅÍÍÛÉ â êîëè÷åñòâå " + ñoffeeSaturatedCount );
        if (ñoffeeBitterCount > 0)   System.out.println("Ìû âûïèëè Êîôå àğîìàò ÃÎĞÜÊÈÉ â êîëè÷åñòâå " + ñoffeeBitterCount );
        if (ñoffeeEasternCount > 0)   System.out.println("Ìû âûïèëè Êîôå àğîìàò ÂÎÑÒÎ×ÍÛÉ â êîëè÷åñòâå " + ñoffeeEasternCount );

        System.out.println("Âñåãî õîğîøåãî!");
        }
    }

