package aufgaben.aufgabe10;

import java.awt.*;

public class Cat extends Animal{
    private static int catCount=0;
    private Color color;

    public Cat(double weight, int age, Color color){
        super(weight, age);
        this.color=color;
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }
    @Override
    public void printAttributes(){
        super.printAttributes();
        System.out.println("Color: " + color.getRGB());
    }
}
