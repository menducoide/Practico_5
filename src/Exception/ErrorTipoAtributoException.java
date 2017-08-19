package Exception;



public class ErrorTipoAtributoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public ErrorTipoAtributoException() {
		 this.message = "Se ha ingresado un valor duplicado";
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
