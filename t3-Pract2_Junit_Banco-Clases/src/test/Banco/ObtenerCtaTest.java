package test.Banco;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.*;
import org.junit.runners.Parameterized.Parameters;

import Banco.Cuenta;


@RunWith(Parameterized.class)

public class ObtenerCtaTest {

	
	 	private String nombre;
	    private String apellido;
	    private int cedula;
	    private Cuenta cuentas[];
	    private  int numCuentas;
		 
		 public ObtenerCtaTest(){
				 
			}
		 
		@Parameters
		 public static Collection<Object[]>shooping(){
			
			 
			 
			 return Arrays.asList(new Object[][]{{},{}});
		}	

		 @Test
		 public void TestItemAccount() {	
			 
			 
			  
		 }
	}



