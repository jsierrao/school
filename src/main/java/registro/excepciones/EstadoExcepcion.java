package registro.excepciones;



public class EstadoExcepcion extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EstadoExcepcion() {}
	
	public EstadoExcepcion(String message) {
		super(message);
	}

}
