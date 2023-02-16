package hangman.model;
public class ModelException extends Exception{
	public static final String NUMERO_NEGATIVO = "Numero Negativo";
	
	public ModelException (String mensaje){
		super(mensaje);
	}
}