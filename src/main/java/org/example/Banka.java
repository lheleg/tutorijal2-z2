package org.example;

import java.util.List;

public class Banka {
    private Long brojRacuna;

    /**
     * basic constructor
     * */
    public Banka() {};
    public Korisnik kreirajNovogKorisnika(String ime, String prez){
        return new Korisnik(ime,prez);
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prez){
        return new Uposlenik(ime,prez);
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
        return new Racun(brojRacuna,k);
    }
    protected List<Korisnik> korisnici;
    protected List<Uposlenik> uposlenici;
}
