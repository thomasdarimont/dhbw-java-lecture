package ba.java.weiteres.strings;

public class StringBeispiel5 {
  public StringBeispiel5() {
    String string1 = "Hallo!";

    // Ersetzen von Zeichenketten:

    // String toLowerCase()
    // Wandelt die Zeichenkette in Kleinbuchstaben.
    String string2 = string1.toLowerCase();
    // String toUpperCase()
    // Wandelt die Zeichenkette in Großbuchstaben.
    String string3 = string1.toUpperCase();
    // String replace(char old, char new)
    // Einzelne Zeichen werden ersetzt: old durch new.
    String string4 = "Salat".replace("Salat", "Schnitzel");
    // String replaceAll(String regex, String new)
    // Ersetzt alle Teilstrings, die die Regular Experession regex trifft, durch den neuen
    // Teilstring new.
    String string5 = "Hallo123".replaceAll("(\\d)", "Zahl");
    // String replaceFirst(String regex, String new)
    // Ersetzt nur den ersten gefundenen Teilstring, den die Regular Experession regex trifft,
    // durch den neuen Teilstring new.
    String string6 = "Hallo123".replaceFirst("(\\d)", "Zahl");

    //  Übung:
    System.out.println(string1);
    System.out.println(string2);
    System.out.println(string3);
    System.out.println(string4);
    System.out.println(string5);
    System.out.println(string6);
  }

  public static void main(String[] args) {
    new StringBeispiel5();
  }
}
