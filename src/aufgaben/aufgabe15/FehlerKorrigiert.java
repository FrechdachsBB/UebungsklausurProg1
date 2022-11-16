package aufgaben.aufgabe15;

public class FehlerKorrigiert {
    private int[] b;
    public FehlerKorrigiert(int[] b) {
        this.b = b;
    }

    public int operation1(int c) {
        if (c < 0 || c >= b.length)
            return -1;
        return b[c];
    }

    public boolean operation2(int c){ //öffnende geschweifte Klammer fehlt
        for (int i = 0; i < b.length; i++) //int c ersetzen durch int i
            if (b[i] == c) //n ersetzen durch b
                return true;

        return false;
    }
}
