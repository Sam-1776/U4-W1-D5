package it.sam.be.classi;

import it.sam.be.interfacce.Volume;
import it.sam.be.superclassi.Elemento_Multimediale_Riproducibile;

import java.util.Scanner;

public class Registrazione_Audio extends Elemento_Multimediale_Riproducibile implements Volume {

    private int volume;
    public Registrazione_Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    @Override
    public void play() {
        String gV = "";
        for (int i = 0; i < volume; i++) {
            gV += "!";
        }

        for (int i = 0; i < durata ; i++) {
            System.out.println(titolo + gV);
        }
    }

    @Override
    public int abbassaVolume() {
        System.out.println("A quanto vuoi aumentare il volume?");
        Scanner scanner = new Scanner(System.in);
        this.volume = volume - scanner.nextInt();
        play();
        return volume;
    }

    @Override
    public int alzaVolume() {
        System.out.println("A quanto vuoi abbassare il volume?");
        Scanner scanner = new Scanner(System.in);
        this.volume = volume + scanner.nextInt();
        play();
        return volume;
    }
}
