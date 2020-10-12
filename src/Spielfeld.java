import java.util.Random;
import java.util.Random;
import java.util.Random;
import java.util.Random;
import java.util.Random;
import java.util.Random;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 29.08.2020
 * @author 
 */

public class Spielfeld {
  
  // Anfang Attribute
  private final int BREITE = 7;
  private final int HOEHE = 6;
  private Feld[][] felder = new Feld[BREITE][HOEHE];
  private int[] hoehe = new int[7];
  // Ende Attribute
  
  // Anfang Methoden
 
  public void zeigeSpielfeld() {
    System.out.println("");
    System.out.println("1 2 3 4 5 6 7 ");
    for (int i=0;i<6;i++) {
      for (int o=0;o<7;o++) {
        if (felder[o][i].getZustand() == 0) {
          System.out.print("- ");
        } // end of if
        if (felder[o][i].getZustand() == 1) {
          System.out.print("X ");
        } // end of if
        if (felder[o][i].getZustand() == 2) {
          System.out.print("O ");
        } // end of if
      } // end of for
      System.out.println("");
    } // end of for 
  }

  public void spielfeldLeeren() {
    for (int i=0;i<7;i++) {
      for (int o=0;o<6;o++) {
        felder[i][o] = new Feld(0);
      } // end of for
    } // end of for  
    
    for (int i=0;i<7;i++) {
      hoehe[i] = 0;
    } // end of for
  }

  public void aendereZustand(int x, int wert) {
    felder[x][5-getHoehe(x)].setZustand(wert);
    setHoehe(x,getHoehe(x)+1);
  }

  public int getHoehe(int zahl) {
    return hoehe[zahl];
  }

  public void setHoehe(int zahl, int hoeheNeu) {
    hoehe[zahl] = hoeheNeu;
  }

  public void gewinnabfrage(int spieler) {
    for (int i=0;i<4;i++) {
      for (int o=0;o<6;o++) {
        if (felder[i][o].getZustand()==spieler && felder[i+1][o].getZustand()==spieler && felder[i+2][o].getZustand()==spieler && felder[i+3][o].getZustand()==spieler) {
          zeigeSpielfeld();
          System.out.println("Spieler " + spieler + " hat gewonnen!");
          System.exit(0);
        } // end of if 
      } // end of for
    } // end of for 
    for (int i=0;i<7;i++) {
      for (int o=0;o<3;o++) {
        if (felder[i][o].getZustand()==spieler && felder[i][o+1].getZustand()==spieler && felder[i][o+2].getZustand()==spieler && felder[i][o+3].getZustand()==spieler) {
          zeigeSpielfeld();
          System.out.println("Spieler " + spieler + " hat gewonnen!");
          System.exit(0);
        } // end of if 
      } // end of for
    } // end of for 
    for (int i=0;i<4;i++) {
      for (int o=0;o<3;o++) {
        if (felder[i][o].getZustand()==spieler && felder[i+1][o+1].getZustand()==spieler && felder[i+2][o+2].getZustand()==spieler && felder[i+3][o+3].getZustand()==spieler) {
          zeigeSpielfeld();
          System.out.println("Spieler " + spieler + " hat gewonnen!");
          System.exit(0);
        } // end of if 
      } // end of for
    } // end of for 
    for (int i=3;i<7;i++) {
      for (int o=0;o<3;o++) {
        if (felder[i][o].getZustand()==spieler && felder[i-1][o+1].getZustand()==spieler && felder[i-2][o+2].getZustand()==spieler && felder[i-3][o+3].getZustand()==spieler) {
          zeigeSpielfeld();
          System.out.println("Spieler " + spieler + " hat gewonnen!");
          System.exit(0);
        } // end of if 
      } // end of for
    } // end of for 
  }

  // Ende Methoden
} // end of Spielfeld

