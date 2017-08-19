package Clases;

import Exception.CadenaNulaException;

public class Alumno {

// ATRIBUTES
private String nombreAlumno;
private String apellidoAlumno;
private String nombreUsuarioAlumno;
private String contraseniaAlumno;

// CONSTRUCTOR
public Alumno(String nombreAlumno, String apellidoAlumno, String nombreUsuarioAlumno, String contraseniaAlumno) {
	super();
	this.nombreAlumno = nombreAlumno;
	this.apellidoAlumno = apellidoAlumno;
	this.nombreUsuarioAlumno = nombreUsuarioAlumno;
	this.contraseniaAlumno = contraseniaAlumno;
}
public Alumno() {
	
}

// GET_SET
public String getNombreAlumno() {
	return nombreAlumno;
}
public void setNombreAlumno(String nombreAlumno) {
	this.nombreAlumno = nombreAlumno;
}
public String getApellidoAlumno() {
	return apellidoAlumno;
}
public void setApellidoAlumno(String apellidoAlumno) {
	this.apellidoAlumno = apellidoAlumno;
}
public String getNombreUsuarioAlumno() {
	return nombreUsuarioAlumno;
}
public void setNombreUsuarioAlumno(String nombreUsuarioAlumno) {
	this.nombreUsuarioAlumno = nombreUsuarioAlumno;
}
public String getContraseniaAlumno() {
	return contraseniaAlumno;
}
public void setContraseniaAlumno(String contraseniaAlumno) {
	this.contraseniaAlumno = contraseniaAlumno;
}


// *** METHODS


public boolean validarLongitudNombreUsuarioAlumno() throws CadenaNulaException  {
				
		if  (this.nombreUsuarioAlumno.length()>12) {
			return false;
		} else if (this.nombreUsuarioAlumno.length()<12) {
			return true;
		}		else {
			throw new CadenaNulaException(); 
		}
	}

	

	




public boolean validarLongitudContraseniaAlumno(){
	if  (this.contraseniaAlumno.length()>12) {
		
		return false;
	} else {
		return true;
	}
		
	
}

public boolean validarInstructores() {
	
	if (new Instructor().accesoGetInstructores() != null ) {
		return true;
		
	}else {return false;}
	
}

public void validarNombreUsuarioNulo() throws CadenaNulaException {
	if (this.nombreAlumno == null) {
		throw new CadenaNulaException();
		
	}
	
}

public boolean accesoAltaAlumno(String nombre_alumno,String apellido_Alumno, String nombre_Usuario, String contrasenia)
{
	if (this.nombreUsuarioAlumno.length()>12 && contrasenia.length() >12) {
		
		return false;
	
			
	}
	else {
		
		return true;
	}
	
		
}

}
