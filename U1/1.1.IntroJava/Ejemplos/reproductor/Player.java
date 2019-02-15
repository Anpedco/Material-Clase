// no hay sentencia package: directorio actual

interface Player {
	/* atributos public static final */ 
	int VOL_MIN = 0;
	int VOL_MAX = 100;
	int VOL_MUTE = VOL_MIN;

	enum ESTADO {STOP, PLAYING, PAUSED};
	
	/* public abstract */ 
	void play(int n);
	void pause();
	void stop();
	void next();
	void last();
	void volumen(int x);
	
	/* Ya implementados: default, public  */
	default void mute() {
		volumen( VOL_MUTE );
	} 

} // interface Player