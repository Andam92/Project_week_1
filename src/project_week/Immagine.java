package project_week;

public class Immagine extends Elemento_multimediale implements Regola_luminosità_interfaccia {

	public Immagine(String titolo) {
		super(titolo);
	}

	public void show() {
		System.out.print(this.titolo);
		for(int i = 0; i < luminosità; i++) {
			System.out.print("*");
			// System.out.print("*");
		}
		System.out.println();
	}

	@Override
	public void aumentaLuminosità() {
		if(luminosità <= 5) {
			System.out.print("Alzo luminosità di 1\n");
			Video.luminosità = luminosità + 1;
		} else System.out.print("La luminosità dell'immagine è al massimo");
		
	}

	@Override
	public void riduciLuminosità() {
		if(luminosità > 0) {
			System.out.print("Abbasso luminosità di 1\n");
			Video.luminosità = luminosità - 1;
		} else System.out.print("La luminosità dell'immagine è al minimo");
		
	}
	

}
