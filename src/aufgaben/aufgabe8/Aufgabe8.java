package aufgaben.aufgabe8;

public class Aufgabe8 {
    public static void main(String[] args) {
        int[] numbers = {-5,12,-19,28};
        int highestNumber = numbers[0];

        for(int i : numbers){
            if(i>highestNumber)highestNumber=i;
        }
        System.out.println("Hoechste Zahl: " + highestNumber);

    }
}
