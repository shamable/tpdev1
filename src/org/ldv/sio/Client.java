package org.ldv.sio;

import java.util.Objects;

public class Client {
  private String nom;
  private String prenom;
  private Adresse domicile;
  private Adresse livraison;

    public Client(String nom, String prenom) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getNom().equals(client.getNom()) &&
                getPrenom().equals(client.getPrenom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom());
    }

    public Client(String nom, String prenom, Adresse domicile, Adresse livraison) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison = livraison;
    }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Override
  public String toString() {
    return "Client {" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            '}';
  }
}
