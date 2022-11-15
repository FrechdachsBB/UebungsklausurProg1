package aufgaben.aufgabe5;

public class MistakeKorrigiert {
    public MistakeKorrigiert ( ) {
    }

    public static void main (String [ ] args ) {
        String a , b ;
        a = "Resultat ist ";
        b = ":";
        int x = 5;
        double y = 3;
        int z=0;
        int res = add (x, z);
        try {
            String s = "15.0";
            int number = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {}
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static int add (int a, int c) {
        int res = a + c;
        return res;
        //res = res + 5;
    }
}
