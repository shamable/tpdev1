package org.ldv.sio;

import java.util.Objects;

public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adresse)) return false;
        Adresse adresse = (Adresse) o;
        return getRue().equals(adresse.getRue()) &&
                getVille().equals(adresse.getVille()) &&
                getCodePostal().equals(adresse.getCodePostal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRue(), getVille(), getCodePostal());
    }

    public Adresse(String rue, String ville, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostale(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse {" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal'" + codePostal + '\'' +
                '}';
    }

}
