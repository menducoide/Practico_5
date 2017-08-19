package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Clases.Nivel;
import Exception.CadenaNulaException;

import org.junit.Before;

public class TestNivel {

	Nivel nivel;
	
	@Before
	public void setUp() {
		nivel = new Nivel();
		nivel.setNombreNivel("PRIMERO");
		nivel.setPuntosExperienciaRequeridos(1);
		
		
	}
	
	@Test
	public void testValidarPuntosExperienciaRequeridosNoCero()  {

			boolean resultadoReal = nivel.validarPuntosExperienciaRequeridosNoCero();
			 boolean resultadoEsp = true;
			 assertEquals(resultadoEsp,resultadoReal);
		
	
	
	}

	@Test
	public void testValidarPuntosExperienciaRequeridosNoNegativos() {
		 boolean resultadoReal = nivel.validarPuntosExperienciaRequeridosNoNegativos();
		 boolean resultadoEsp = true;
		 assertEquals(resultadoEsp,resultadoReal);	
	}
	
	@Test(expected=CadenaNulaException.class)
	public void testValidarNombreNivelNoNulo() throws CadenaNulaException {	
		nivel.validarNombreNivelNoNulo();
		
	}
	
	
	

}
