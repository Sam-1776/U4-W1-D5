import it.sam.be.classi.Immagine;
import it.sam.be.classi.Registrazione_Audio;
import it.sam.be.classi.Video;
import it.sam.be.superclassi.Elemento_Multimediale;
import it.sam.be.superclassi.Elemento_Multimediale_Riproducibile;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PlayerMultimediale {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Progetto settimanale");

        Scanner scanner = new Scanner(System.in);

        Elemento_Multimediale[] lettore_multimediale = new Elemento_Multimediale[5];

        for (int i = 0; i < 5; i++) {
        inserisci(lettore_multimediale, i);
        }

        while(true){
            System.out.println("Scegli un elemento (1, 2, 3, 4, 5, 0-Esci)");
            int scelta = scanner.nextInt();
            if(scelta == 0) break;
            if(scelta >= 1 && scelta <= 5) {
                if (lettore_multimediale[scelta - 1] instanceof Immagine){
                    ((Immagine)lettore_multimediale[scelta - 1]).show();
                }else {
                    ((Elemento_Multimediale_Riproducibile) lettore_multimediale[scelta - 1]).play();
                }
            } else {
                System.out.println("Scelta non valida");
            }
        }

    }

    public static Elemento_Multimediale[] inserisci(Elemento_Multimediale[] x, int c){

        System.out.println("Cosa vuoi inserire?");
        Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();
        switch (y){
            case "audio":{
                System.out.println("Qual è il titolo del audio?");
                String T = scanner.nextLine();
                System.out.println("Qual è la durata del audio?");
                int D = scanner.nextInt();
                System.out.println("A che volume vuoi ascoltarlo?");
                int V = scanner.nextInt();
                Elemento_Multimediale audio = new Registrazione_Audio(T,D,V);
                x[c] = audio;
                break;
            }
            case "video":{
                System.out.println("Qual è il titolo del video?");
                String Tv = scanner.nextLine();
                System.out.println("Qual è la durata del video?");
                int Dv = scanner.nextInt();
                System.out.println("A che volume vuoi ascoltarlo?");
                int Vv= scanner.nextInt();
                System.out.println("A che luminosità vuoi impostarlo?");
                int Lv = scanner.nextInt();
                Elemento_Multimediale video = new Video(Tv,Dv,Vv,Lv);
                x[c] = video;
                break;
            }
            case "immagine":{
                System.out.println("Qual è il titolo del immagine?");
                String Ti = scanner.nextLine();
                System.out.println("A che luminosità vuoi impostarlo?");
                int Li = scanner.nextInt();
                Elemento_Multimediale immagine = new Immagine(Ti,Li);
                x[c] = immagine;
                break;
            }
            default:{
                System.out.println("Non hai inserito nulla, riprova");
                inserisci(x,c);
            }
        }
        return x;
    }
}