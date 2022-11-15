package org.example;

public class Racun {

    private long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;
    private double prekoracenje;
    /**
     * basic constructor
     * */
    Racun (long r, Osoba o) {
        brojRacuna = r;
        korisnikRacuna = o;
    }

    private boolean provjeriOdobrenjePrekoracenja(double iznos) {
        return this.prekoracenje > iznos;
    }

    public boolean izvrisiUplatu(double iznos){
        this.stanjeRacuna += iznos;
        return true;
    }

    public boolean izvrsiIsplatu(double iznos){
        if(iznos > this.stanjeRacuna) return false;
        this.stanjeRacuna -= iznos;
        return true;
    }

    public long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public boolean isOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }

    public void setOdobrenjePrekoracenja(boolean odobrenjePrekoracenja) {
        this.odobrenjePrekoracenja = odobrenjePrekoracenja;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public double getPrekoracenje() {
        return prekoracenje;
    }

    public void setPrekoracenje(double prekoracenje) {
        this.prekoracenje = prekoracenje;
    }
}
