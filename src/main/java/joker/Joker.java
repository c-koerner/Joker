package joker;
import joker.Witzeliste;
import joker.Ausgabe;

public class Joker {

    private Ausgabe printWitz = new Ausgabe();

    private Witzeliste listjoke = new Witzeliste();
 
    public void telljoke() {
        String Witz = listjoke.getjoke();

        printWitz.printjoke(Witz);
    }
}
