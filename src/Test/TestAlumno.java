package Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Clases.*;
import Exception.*;

public class TestAlumno {

	Alumno alumno;
	
	
	@Before
	public void setUp() {
		alumno = new Alumno();
		alumno.setNombreUsuarioAlumno("user");
		alumno.setContraseniaAlumno("pepe_frog") ;
	}
	
	@Test
	public void testValidarLongitudNombreUsuarioAlumno() throws CadenaNulaException {
		try {
			boolean resultadoReal = alumno.validarLongitudNombreUsuarioAlumno();
			 boolean resultadoEsp = true;
			 assertEquals(resultadoEsp,resultadoReal);
		
		}catch(CadenaNulaException e) {}
	
	}

	@Test
	public void testValidarLongitudContraseniaAlumno() {
		 boolean resultadoReal = alumno.validarLongitudContraseniaAlumno();
		 boolean resultadoEsp = true;
		 assertEquals(resultadoEsp,resultadoReal);	
	}
	
	@Test(expected=CadenaNulaException.class)
	public void testValidarNombreUsuarioNulo() throws CadenaNulaException {	
		alumno.validarNombreUsuarioNulo();
		
	}

}
