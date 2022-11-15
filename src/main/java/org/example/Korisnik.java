package org.example;

import java.util.Objects;

public class Korisnik extends Osoba {

    private Racun racun;
    /**
     * basic constructor
     * */
    public Korisnik(String i, String p) {
        super(i, p);
    }
    /**
     * adds new account
     * */
    public void dodajRacun(Racun racun) {
        this.racun = racun;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Korisnik korisnik = (Korisnik) obj;
        return Objects.equals(racun, korisnik.racun);
    }
}
