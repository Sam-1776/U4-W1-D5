package it.sam.be.superclassi;

public abstract class Elemento_Multimediale {
    protected String titolo;

    public Elemento_Multimediale(String titolo) {
        this.titolo = titolo;
    }
    public abstract void play();
    public abstract void show();
}
