package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ClientTest {
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ClientTest)) return false;
    ClientTest that = (ClientTest) o;
    return c.equals(that.c);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c);
  }

  private Client c;

  @Before
  public void initializeEachTest() {
    this.c = new Client("Dijkstra", "Edsger");
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  public void setC(Client c) {
    this.c = c;
  }

  @Test
  public void setNom(String s) {
    this.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  private void assertEquals(String edsger, String prenom) {
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }
}