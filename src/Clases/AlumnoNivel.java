package Clases;

import java.util.List;

public class AlumnoNivel {

	private Nivel nivel;
	private List<Permiso> listaPermisos;
	private Alumno alumno;
	
	
	
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public List<Permiso> getListaPermisos() {
		return listaPermisos;
	}
	public void setListaPermisos(List<Permiso> listaPermisos) {
		this.listaPermisos = listaPermisos;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	
	
}
