package it.sam.be.classi;

import it.sam.be.interfacce.Luminosità;
import it.sam.be.superclassi.Elemento_Multimediale;

import java.util.Scanner;

public class Immagine extends Elemento_Multimediale implements Luminosità {

    private int luminosità;
    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    @Override
    public int aumentaLuminosità() {
        System.out.println("A quanto vuoi aumentare la luminosità?");
        Scanner scanner = new Scanner(System.in);
        this.luminosità = luminosità + scanner.nextInt();
        show();
        return luminosità;
    }

    @Override
    public int diminuisciLuminosità() {
        System.out.println("A quanto vuoi diminuire la luminosità?");
        Scanner scanner = new Scanner(System.in);
        this.luminosità = luminosità - scanner.nextInt();
        show();
        return luminosità;
    }

    @Override
    public void play() {
        System.out.println("non sono riproducibile");
    }

    @Override
    public void show() {
        String gL = "";
        for (int i = 0; i < luminosità; i++) {
            gL += "*";
        }
            System.out.println(titolo + gL);
    }
}
