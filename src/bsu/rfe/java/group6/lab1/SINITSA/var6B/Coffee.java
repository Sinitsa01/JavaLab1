package bsu.rfe.java.group6.lab1.SINITSA.var6B;

public class Coffee extends Food implements Nutritious {

    private String aroma;

    public Coffee(String aroma) {
        super("����");
        this.aroma = aroma;
    }
    @Override
    public void consume() {
        System.out.println(this + " ����� " + " �������� " + calculateCalories());
    }

    public String getFlavour() {
        return aroma;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Coffee)) return false;
            return aroma.equals(((Coffee)arg0).aroma);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " ������ " + aroma.toUpperCase();
    }

    @Override
    public int calculateCalories() {
        if (this.aroma == null) {
            return 0;
        }
        switch (this.aroma.toLowerCase()) {
            case "����������":
                return 3;
            case "�������":
                return 2;
            case "���������":
                return 4;
            default: return 0;
        }
    }

}

