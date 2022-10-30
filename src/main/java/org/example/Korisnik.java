package org.example;

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
    protected void dodajRacun(Racun racun) {
        this.racun = racun;
    }

}
