
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


}
