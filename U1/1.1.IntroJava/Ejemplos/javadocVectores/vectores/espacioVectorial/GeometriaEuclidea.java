package espacioVectorial;

/**
  * Interfaz cuya implementación implica el desarrollo del método sumaDeCuadrados()
  * 
  * Incluye como método <code>default</code> el  método <code>double norma()</code>
  */
public interface GeometriaEuclidea {
	

	/**
     * Debe devoler la suma de cada coordenada al cuadrado
     *
     * @return la suma de los cuadrados de las coordenadas
     */
	double sumaDeCuadrados();


	/**
      * Sea cual sea la dimensionalidad de la coordenada, la norma Euclídea
      * será siempre la raíz cuadrada de la suma de los cuadrados de todas
      * las coordenadas. Por ello se incluye como método <code>default</code>
      * @return la norma euclídea de la coordenada
      */
	default double norma() {
		return Math.sqrt( sumaDeCuadrados() );
	}
	
}