package Test;
import Clases.Instructor;
import Exception.CadenaNulaException;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestInstructor {
 Instructor instructor;
 
 @Before
 public void setUp()
 {
	 instructor = new Instructor();
	 instructor.setNombreInstructor("");
 }
	
@Test(expected=CadenaNulaException.class)
public void validarNombreInstructorTest() throws CadenaNulaException{
	instructor.validarNombreInstructor();	
}
	
}
