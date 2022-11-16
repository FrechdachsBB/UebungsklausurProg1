package aufgaben.aufgabe1;

public class Aufgabe1 {
    public static void main(String[] args) {
        String regex = "(a(b|c)*a?)|(ab(b|c)+a)|(a(b|c)*ba?(b|c)*)";
        String[] toCheck = {"abac", "abaca", "aca", "abc", "abcab", "bc"};
        for(String s : toCheck){
            System.out.println(s + ":" + s.matches(regex));
        }
    }


}
