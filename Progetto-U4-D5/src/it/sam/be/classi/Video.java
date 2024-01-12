package it.sam.be.classi;

import it.sam.be.interfacce.Luminosità;
import it.sam.be.interfacce.Volume;
import it.sam.be.superclassi.Elemento_Multimediale_Riproducibile;

import java.util.Scanner;

public class Video extends Elemento_Multimediale_Riproducibile implements Luminosità, Volume {
    private  int volume;
    private int luminosità;
    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosità = luminosità;
    }

    @Override
    public void play() {
        String gV = "";
        String gL = "";
        for (int i = 0; i < volume; i++) {
            gV += "!";
        }
        for (int i = 0; i < luminosità; i++) {
            gL += "*";
        }
        for (int i = 0; i < durata ; i++) {
            System.out.println(titolo + gV + gL);
        }
    }

    @Override
    public void show() {
        System.out.println("non si può mostrare");
    }

    @Override
    public int abbassaVolume() {
        System.out.println("A quanto vuoi abbassare il volume?");
        Scanner scanner = new Scanner(System.in);
        this.volume = volume - scanner.nextInt();
        play();
        return volume;
    }

    @Override
    public int alzaVolume() {
        System.out.println("A quanto vuoi aumentare il volume?");
        Scanner scanner = new Scanner(System.in);
        this.volume = volume + scanner.nextInt();
        play();
        return volume;
    }

    @Override
    public int aumentaLuminosità() {
        System.out.println("A quanto vuoi aumentare la luminosità?");
        Scanner scanner = new Scanner(System.in);
        this.luminosità = luminosità - scanner.nextInt();
        play();
        return luminosità;
    }

    @Override
    public int diminuisciLuminosità() {
        System.out.println("A quanto vuoi diminuire la luminosità?");
        Scanner scanner = new Scanner(System.in);
        this.luminosità = luminosità - scanner.nextInt();
        play();
        return luminosità;
    }
}
