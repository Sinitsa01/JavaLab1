package bsu.rfe.java.group6.lab1.SINITSA.var6B;

public class Cheese extends Food implements Nutritious {

    public Cheese() {
        super("���");

    }
    public void consume() {
        System.out.println(this.name + " ������"+" �������� "+calculateCalories());
    }

    @Override
    public int calculateCalories() {
        return 50;
    }
}
