/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 29.08.2020
 * @author 
 */

public class Feld {
  
  // Anfang Attribute
  private int zustand;
  // Ende Attribute
  
  // Anfang Methoden
  public Feld(int zustand) {
    this.zustand = zustand;
    }
  public int getZustand() {
    return zustand;
  }

  public void setZustand(int zustandNeu) {
    zustand = zustandNeu;
  }

  // Ende Methoden
} // end of Feld

