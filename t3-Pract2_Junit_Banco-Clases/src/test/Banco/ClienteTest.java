package test.Banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Banco.Banco;
import Banco.Cliente;

public class ClienteTest {
	private Banco banco;
    private Cliente clientes[];	
    Integer [] numcuentas_entrada= new Integer[4];
	Integer[] numcuentas=new Integer[4];
	
	@Before
	public void CrearBanco()
	{
		
		//Array con los numeros de cuentas que se asignan a un cliente
		numcuentas_entrada[0]=113;
		numcuentas_entrada[1]=223;
		
		
		
		//Crear un Objeto Banco "Mi Banco"
		banco = new Banco("mi banco");
        //Añadir un Cliente al Banco nombre=Carlos, Apellidos=Perez, Telefono= 28254435
		 banco.anadirCliente("Carlos", "Perez", 28254435);
		//Obtener el cliente
		 clientes=banco.getClientes();
		//Crear dos cuentas nuevas al cliente creado
		 clientes[1].asignarCuenta("cuentaCorriente", 150, numcuentas_entrada, 0, 0f);
		 clientes[2].asignarCuenta("ahorro",150 ,numcuentas_entrada, 1, 1f);
	}

	@Test
	public void testasignarCuenta() {
		
        //Comprobar si se ha asignado la cuenta 113 al cliente
		assertEquals("numero_cta",(Integer)113, numcuentas[0] );
	

	}
	
	@Test
	public void testgetNombre() {
		
        //Comprobar si se ha asignado la cuenta 113 al cliente
		assertEquals("nombre incorrecot","Carlos Perez", clientes[0].getNombre() );
		}
	
	@Test
	public void testobtenerCuenta() {
		//Obtener las dos cuentas almacenadas su numero de cuenta
		          
       	//assertEquals compara el contenido del array numcuentas_entrada que tiene los valores
       	//de los numeros de cuenta creados con array numcuentas que devuelve 
    		// el método obtenerCuentas
				
			
		
	}
}
