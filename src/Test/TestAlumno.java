package Test;
import static org.junit.Assert.*;

import org.junit.Test;


import Clases.*;

public class TestAlumno {

	@Test
	public void testValidarLongitudNombreUsuarioAlumno() {
		 boolean resultadoReal = new Alumno().validarLongitudNombreUsuarioAlumno("USUARIO_VAL");
		 boolean resultadoEsp = true;
		 assertEquals(resultadoEsp,resultadoReal);
	}

	@Test
	public void testValidarLongitudContraseniaAlumno() {
		 boolean resultadoReal = new Alumno().validarLongitudContraseniaAlumno("USUARIO_VAL");
		 boolean resultadoEsp = true;
		 assertEquals(resultadoEsp,resultadoReal);	
	}
	

}
