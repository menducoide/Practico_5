package Clases;

public class Instructor {

// *** ATRIBUTOS	
private String nombreInstructor;
private String apellidoInstructor;
private String nombreUsuarioInstructor;
private String contraseniaInstructor;

// *** CONSTRUCTORES
public Instructor(String nombreInstructor, String apellidoInstructor, String nombreUsuarioInstructor,
		String contraseniaInstructor) {
	super();
	this.nombreInstructor = nombreInstructor;
	this.apellidoInstructor = apellidoInstructor;
	this.nombreUsuarioInstructor = nombreUsuarioInstructor;
	this.contraseniaInstructor = contraseniaInstructor;
}
public Instructor() {
	super();

}

// *** GET_SET
public String getNombreInstructor() {
	return nombreInstructor;
}
public void setNombreInstructor(String nombreInstructor) {
	this.nombreInstructor = nombreInstructor;
}
public String getApellidoInstructor() {
	return apellidoInstructor;
}
public void setApellidoInstructor(String apellidoInstructor) {
	this.apellidoInstructor = apellidoInstructor;
}
public String getNombreUsuarioInstructor() {
	return nombreUsuarioInstructor;
}
public void setNombreUsuarioInstructor(String nombreUsuarioInstructor) {
	this.nombreUsuarioInstructor = nombreUsuarioInstructor;
}
public String getContraseniaInstructor() {
	return contraseniaInstructor;
}
public void setContraseniaInstructor(String contraseniaInstructor) {
	this.contraseniaInstructor = contraseniaInstructor;
}

// *** METHODS



}
