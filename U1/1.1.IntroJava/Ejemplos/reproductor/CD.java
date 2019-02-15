// no hay sentencia package: directorio actual

class CD implements Player {
	
	public final String sistema = "CD";
	int n_cancion = 1;
	int vol = VOL_MIN;
	ESTADO estado = ESTADO.STOP;

	public void play(int n){
		if (n>0) { 
			stop(); // Antes de tocar una cancion se pone en modo STOP
			n_cancion = n;
			estado = ESTADO.PLAYING;
		}
		System.out.println("En " + sistema + ". Tocando canción " + n_cancion 
			             + ". Estado: " + estado );
	}

	public void stop() {
		estado = ESTADO.STOP;
		System.out.println("En " + sistema + ". Parando canción " + n_cancion
			              +". Estado: " + estado );
	}

	public void mute() {
		// El volumen decrece linealmente, no bruscamente hasta 0
		for (int v = vol; v >= 0; v--) {
			volumen(v);
		}
	}

	public void next() {
		play(n_cancion+1);
	}

	public void last() {
		play(n_cancion-1);
	}

	public void pause(){
		estado = ESTADO.PAUSED;
		System.out.println("En " + sistema + ". Pausando canción " + n_cancion
			             + ". Estado: " + estado );
	}

	public void volumen(int x) {
		if (x<VOL_MAX) {
			vol = x;
		}
		System.out.println("En " + sistema + ". Ajustando volumen a valor: "+ vol);
	}

} // class CD		