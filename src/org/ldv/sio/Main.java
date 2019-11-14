package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Client c = new Client("nom", "prenom");
    System.out.println(c.toString());
  }
}
