package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;

  @Before
  public void initializeEachTest() {
    this.c = new Client("Dijkstra", "Edsger");
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }
}