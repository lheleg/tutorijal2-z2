package org.example;

public class Racun {

    /**
     * basic constructor
     * */
    Racun (long r, Osoba o) {
        brojRacuna = r;
        korisnikRacuna = o;
    }

    private boolean provjeriOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }
    public boolean izvrisiUplatu(){return true;};
    public boolean izvrdiIsplatu(){return true;};
    protected long brojRacuna;
    protected Osoba korisnikRacuna;
    protected boolean odobrenjePrekoracenja;
    protected double stanjeRacuna;
}
