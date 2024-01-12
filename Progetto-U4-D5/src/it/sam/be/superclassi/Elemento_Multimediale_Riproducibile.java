package it.sam.be.superclassi;

public abstract class Elemento_Multimediale_Riproducibile extends Elemento_Multimediale {

    protected int durata;
    public Elemento_Multimediale_Riproducibile(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }


}
