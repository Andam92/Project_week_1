package project_week;

public class Video extends Elemento_multimediale implements Riproducibile_interfaccia, Regola_volume_interfaccia, Regola_luminosità_interfaccia {

	public Video (String titolo, int durata) {
		super(titolo, durata);
	}
	
	public void play() {
		System.out.println("Riproduco il video " + titolo);
		for(int i = 0; i < durata; i++ ) {
			System.out.print(this.titolo);
			for(int j = 0; j < volume; j++) {
				System.out.print("!");				
			}
			for(int k = 0; k < luminosità; k++) {
				System.out.print( "*");
			}
			System.out.println();
		}
	}
	
	@Override
	public void aumentaLuminosità() {
		if(luminosità <= 5) {
			System.out.print("Alzo luminosità di 1\n");
			Video.luminosità = luminosità + 1;
		} else System.out.print("La luminosità del video è al massimo");
		
	}

	@Override
	public void riduciLuminosità() {
		if(luminosità > 0) {
			System.out.print("Abbasso luminosità di 1\n");
			Video.luminosità = luminosità - 1;
		} else System.out.print("La luminosità del video è al minimo");
		
	}

	@Override
	public void vol_up() {
		if(volume <= 5) {
			System.out.print("Alzo il volume di 1\n");
			Video.volume = volume + 1;
		} else System.out.print("Il volume del video è al massimo");
	}

	@Override
	public void vol_down() {
		if(volume > 0) {
			System.out.print("Abbasso il volume di 1\n");
			Video.volume = volume - 1;
		} else System.out.print("Il volume del video è al minimo");		
	}

}
