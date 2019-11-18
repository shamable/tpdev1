package org.ldv.sio;

public class Main {

    private static Object Adresse;

    public static void main(String[] args) {
    Client c = new Client("nom", "prenom");
    System.out.println(c.toString());
  }
  public static void main(Adresse[] args) {
      Client c = new Client("domicile", "livraison");
      System.out.println(c.toString());
  }
}
