package bsu.rfe.java.group6.lab1.SINITSA.var6B;

import java.util.ArrayList;
import java.util.List;

public class  MainApplication {
    public static void main(String[] args) throws Exception {

        Cheese cheese = new Cheese();

        Coffee �offeeSaturated = new Coffee("����������");
        Coffee �offeeBitter = new Coffee("�������");
        Coffee �offeeEastern = new Coffee("���������");

        Apple appleSmall = new Apple("�����");
        Apple appleMiddle = new Apple("�������");
        Apple appleBid = new Apple("�������");

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
                System.out.println("������ �������� ���");
                }
        }
        int appleSmallCount = 0;
        int appleMiddleCount = 0;
        int appleBigCount = 0;
        int cheesCount = 0;
        int �offeeSaturatedCount = 0;
        int �offeeBitterCount = 0;
        int �offeeEasternCount = 0;
     
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
            if (�offeeSaturated.equals(foodList.get(i))){
            	�offeeSaturatedCount++;
            }
            if (�offeeBitter.equals(foodList.get(i))){
            	�offeeBitterCount++;
            }
            if (�offeeEastern.equals(foodList.get(i))){
            	�offeeEasternCount++;
            }
            
        }

        for (Food item : foodList) {
            if (item != null) {
                item.consume();
            } else
                break;
        }
        if (cheesCount > 0)       System.out.println("�� ����� ��� � ���������� " + cheesCount );
        if (appleBigCount > 0)    System.out.println("�� ����� ������ �������� ������� � ���������� " + appleBigCount );
        if (appleMiddleCount > 0) System.out.println("�� ����� ������ �������� ������� � ���������� " + appleMiddleCount );
        if (appleSmallCount > 0)  System.out.println("�� ����� ������ �������� ����� � ���������� " + appleSmallCount );
        if (�offeeSaturatedCount > 0)   System.out.println("�� ������ ���� ������ ���������� � ���������� " + �offeeSaturatedCount );
        if (�offeeBitterCount > 0)   System.out.println("�� ������ ���� ������ ������� � ���������� " + �offeeBitterCount );
        if (�offeeEasternCount > 0)   System.out.println("�� ������ ���� ������ ��������� � ���������� " + �offeeEasternCount );

        System.out.println("����� ��������!");
        }
    }

