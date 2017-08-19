package Clases;


import Exception.*;

public class Nivel {

	
	private int puntosExperienciaRequeridos ;
	private String nombreNivel;
	private int numeroOrdenNivel;
	
	
	public Nivel() {
	
	}
	
	
	public int getPuntosExperienciaRequeridos() {
		return puntosExperienciaRequeridos;
	}
	public void setPuntosExperienciaRequeridos(int puntosExperienciaRequeridos) {
		this.puntosExperienciaRequeridos = puntosExperienciaRequeridos;
	}
	public String getNombreNivel() {
		return nombreNivel;
	}
	public void setNombreNivel(String nombreNivel) {
		this.nombreNivel = nombreNivel;
	}
	public int getNumeroOrdenNivel() {
		return numeroOrdenNivel;
	}
	public void setNumeroOrdenNivel(int numeroOrdenNivel) {
		this.numeroOrdenNivel = numeroOrdenNivel;
	}
	
	public boolean validarPuntosExperienciaRequeridosNoNegativos() {		
		if (this.puntosExperienciaRequeridos < 0 ) {return false;}
		else {return true;}		
	}
	public boolean validarPuntosExperienciaRequeridosNoCero() {		
		if (this.puntosExperienciaRequeridos == 0 ) {return false;}
		else {return true;}		
	}
	
	public void validarNombreNivelNoNulo() throws CadenaNulaException{		
		if (this.nombreNivel == null ) {throw new CadenaNulaException();}	
	}
	

}
