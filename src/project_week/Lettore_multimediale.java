package project_week;

import java.util.Scanner;

public class Lettore_multimediale {
	private static Elemento_multimediale[] lista_elementi = new Elemento_multimediale[5];
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		Audio audio1 = new Audio("SAS", 1);        // AUDIO (titolo, durata) 
		Video video1 = new Video("La bamba", 3);  // VIDEO(titolo, durata, luminosità)
		Immagine img1 = new Immagine("Un cane");  // IMG (titolo)
		
		img1.show();
		
//		video1.vol_up();
//		video1.play();
		
//	    audio1.vol_up();
//		audio1.getVolume();
//		audio1.vol_down();
//		audio1.getVolume();
//		
//		
//     	audio1.vol_up();
//	audio1.play();
		Elemento_multimediale[] arrayElementi = crea_lista(lista_elementi);
		play(arrayElementi);
	
		
		
	}
	
	public static Elemento_multimediale[] crea_lista (Elemento_multimediale[] lista_elementi){
			
		String titolo;
		String tipologia;
		int durata;
		Immagine img;
		Audio canzone;
		Video video; 
		int counter = 0;
		while(counter < lista_elementi.length) {
			
			System.out.println("Inserisci tipo: immagine, audio, video");
			tipologia = s.nextLine().toLowerCase();
			
			if(tipologia.equals("immagine"))  {
				System.out.println("Scegli titolo");
				titolo = s.nextLine();
				img = new Immagine(titolo);
				lista_elementi[counter] = img;
				counter++;
			} else if(tipologia.equals("audio")) {
				System.out.println("Scegli titolo");
				titolo = s.nextLine();
				System.out.println("Scegli durata");
				durata = s.nextInt(); //bugfix del buffer
				canzone = new Audio(titolo, durata);
				lista_elementi[counter] = canzone;
				s.nextLine();
				counter++;
			} else if(tipologia.equals("video")) {
				System.out.println("Scegli titolo");
				titolo = s.nextLine();
				System.out.println("Scegli durata");
				durata = s.nextInt();
				video = new Video(titolo, durata);
				s.nextLine(); //bugfix del buffer
				lista_elementi[counter] = video;
				counter++;			}
			
			// System.out.println("prova");
			 
		}
		return lista_elementi;
	}
	
	public static void play(Elemento_multimediale[] arrayElementi) {	
		Immagine img;
		Audio audio;
		Video video;
		boolean riproduci = true;
		int elementoSelezionato;
		while(riproduci) {
			System.out.println("Inserire numero da 1 a 5 per scegliere l'elemento");
			elementoSelezionato = s.nextInt();
			if(arrayElementi[elementoSelezionato - 1] instanceof Immagine) {
				img = (Immagine) arrayElementi[elementoSelezionato - 1];
				img.show();
			} else if(arrayElementi[elementoSelezionato - 1] instanceof Audio) {
				audio = (Audio) arrayElementi[elementoSelezionato - 1];
				audio.play();
			} else if(arrayElementi[elementoSelezionato - 1] instanceof Video) {
				video = (Video) arrayElementi[elementoSelezionato - 1];
				video.play();
		} else if(elementoSelezionato == 0) {
			riproduci = false;
		}
	}
 }

}
