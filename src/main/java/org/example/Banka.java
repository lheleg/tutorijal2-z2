package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    /**
     * basic constructor
     * */
    public Banka() {
        this.korisnici = new ArrayList<Korisnik>();
        this.uposlenici = new ArrayList<Uposlenik>();
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prez){
        Korisnik k = new Korisnik(ime,prez);
        this.korisnici.add(k);
        return k;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prez){
        Uposlenik u = new Uposlenik(ime,prez);
        this.uposlenici.add(u);
        return u;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun r = null;
        for (int i = 0; i < this.korisnici.size(); i++){
            if (this.korisnici.get(i).equals(k)){ // equals method defined on class Korisnik
                Long brojRacuna = (new Random()).nextLong(); // generate random number for brojRacuna
                r = new Racun(brojRacuna, this.korisnici.get(i));
                break;
            }
        }
        return r;
    }
}
