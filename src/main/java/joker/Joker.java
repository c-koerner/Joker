package joker;

import java.util.Random;

public class Joker {

    private Ausgabe printWitz = new Consolenausgabe();
    private Ausgabe colorprintWitz = new Colorausgabe();
    private Ausgabe guiprintWitz = new Guiausgabe();

    private Witzeliste listjoke = new Witzeliste();
 
    public void telljoke() {
        String witz = listjoke.getjoke();

        Ausgabe[] ausgaben = {
            printWitz,
            colorprintWitz,
            guiprintWitz
        };
        Random generator = new Random();
        int index = generator.nextInt(ausgaben.length);

        ausgaben[index].printjoke(witz);
    }
}
