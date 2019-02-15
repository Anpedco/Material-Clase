// no hay sentencia package: directorio actual

class TestPlayers {
	
	public static void main ( String[] args ) {

		MP3 mp3 = new MP3();
		mp3.play(1);
		mp3.volumen(3);
		mp3.mute();
		mp3.play(3);
		mp3.next();
		mp3.stop();

		CD cd = new CD();
		cd.play(1);
		cd.volumen(3);
		cd.mute();
		cd.play(3);
		cd.next();
		cd.stop();

	}
	
} // class TestPlayers		