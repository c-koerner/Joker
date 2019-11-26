package joker;

import javax.swing.JOptionPane;

public class Guiausgabe implements Ausgabe {

    public void printjoke(String joke){
        JOptionPane.showMessageDialog(null, joke);
    }
}