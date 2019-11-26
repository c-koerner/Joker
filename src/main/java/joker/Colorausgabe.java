package joker;


public class Colorausgabe implements Ausgabe {
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_BLUE = "\u001B|36m";

    public void printjoke (String joke) {
        System.out.println(ANSI_RED + joke);
    }
}