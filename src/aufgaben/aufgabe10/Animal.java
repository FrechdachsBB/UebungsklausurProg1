package aufgaben.aufgabe10;

public class Animal {
    protected double weight;
    protected int age;

    public Animal(double weight, int age){
        this.weight=weight;
        this.age=age;
    }

    public void printAttributes(){
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
    }
}
