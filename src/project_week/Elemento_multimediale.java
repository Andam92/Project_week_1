package project_week;

public class Elemento_multimediale {
	protected String titolo;
	protected static int volume = 3;
	protected static int luminosità = 3;
	protected int durata;	
	public void play() {		
	}
	

	
	public Elemento_multimediale(String titolo) { // IMMAGINI		
		this.titolo = titolo;
	
	}
			
	public Elemento_multimediale(String titolo, int durata) { // AUDIO-VIDEO
		this(titolo);
		this.durata = durata;	
	}	
	
	
	public void getVolume() {
		System.out.println(this.volume);
	}
	
	public void setVolumeAndLuminosità(int volume, int luminosità) {
		this.volume = volume;
		this.luminosità = luminosità;
	}
}
