// no hay sentencia package: directorio actual

class MP3 implements Player {

	public final String sistema = "MP3";
	int n_cancion = 1;
	int vol = VOL_MIN;
	ESTADO estado = ESTADO.STOP;

	public void play(int n){
		if (n>0) { 
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
	
} // class MP3		