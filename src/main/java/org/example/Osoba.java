package org.example;

public class Osoba {
    private String ime, prezime;
    /**
     * basic constructor
     * */
    public Osoba (String i, String p){
        ime = new String(i);
        prezime = new String(p);
    }
    @Override
    public String toString() {
        return ime+" "+prezime;
    }
}
