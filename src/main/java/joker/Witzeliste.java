package joker;
import java.util.Random;

public class Witzeliste {

    private String[] witze = {
        "Witz 1",
        "Witz 2",
        "Witz 3"
    };

    public String getjoke(){
        Random generator = new Random();
        int randomNumber = generator.nextInt(witze.length);
        String joke = witze[randomNumber];
        return joke;

    }
    /*private String hatwitze(int nr) {
        int jokenumber = nr;
        String selection = "Whoops";
        if ( jokenumber = 1) {
            selection = "Witz 1";
        } else if (jokenumber = 2) {
            selection = "Witz 2";
        }
        return selection;
    } */


    }