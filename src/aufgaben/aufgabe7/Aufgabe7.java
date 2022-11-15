package aufgaben.aufgabe7;

public class Aufgabe7 {

    public static int addOddNumbers(int end){
        if(end < 0)throw new IllegalArgumentException();
        int result = 0;
        for(int i=1;i<=end;i+=2){
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addOddNumbers(10)); //Gibt 25 aus
    }
}
