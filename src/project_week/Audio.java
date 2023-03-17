package project_week;

public class Audio extends Elemento_multimediale implements Riproducibile_interfaccia, Regola_volume_interfaccia {

	public Audio(String titolo, int durata) {
		super(titolo, durata);		
	}

	public void play() {
		System.out.println("Avvio canzone " + "'" + titolo + "'");
		for(int i = 0; i < durata; i++) {
			System.out.print(this.titolo);
			for (int j = 0; j < volume; j++) {
				System.out.print("!");
			}
			System.out.println();
		}		
	}

	@Override
	public void vol_up() {
		// TODO Auto-generated method stub
		if(volume <= 5) {
			Audio.volume = volume + 1;
		} else System.out.println("Il volume è già al massimo!");
	}

	@Override
	public void vol_down() {
		// TODO Auto-generated method stub
		if(volume > 1) {
			Audio.volume = volume - 1;
		} else System.out.println("Il volume è già al minimo!");
	}

}
