package aufgaben.aufgabe16;

public class Aufgabe16c {

    //Fehlerbehandlung mittels try/catch
    private static void beispiel1(){
        try{
            fehler();
        }catch (MyOwnException e){
            //Hier Code einfügen, der im Fehlerfall ausgeführt werden soll
        }
    }

    //Fehlerbehandlung mittels throws
    private static void beispiel2() throws MyOwnException{
        fehler();
    }



    private static void fehler()throws MyOwnException{
        throw new MyOwnException();
    }

}
