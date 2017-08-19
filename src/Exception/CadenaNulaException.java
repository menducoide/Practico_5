package Exception;

public class CadenaNulaException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;
 
 public CadenaNulaException() {
	 this.message = "Se ha ingresado un campo Nulo";
 }
 
 
	@Override
public String toString() {		
	// TODO Auto-generated method stub
	return this.message;
}
	

	@Override
public String getMessage() {		
	// TODO Auto-generated method stub
	return this.message;
}
		
}
