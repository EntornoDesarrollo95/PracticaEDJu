package test.Banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Banco.Banco;
import Banco.Cliente;
import Banco.Cuenta;

public class CuentaTest {
	private Banco banco1;
    private Cliente clientes[];	
    Integer [] numcuentas_entrada= new Integer[4];
    private Cuenta cuentas[];


	@Before
	public void CrearBanco()
	{
		/*asignamos la cuentas de entradas*/
		numcuentas_entrada[0]=113;
		numcuentas_entrada[1]=223;

		//Crear un Objeto Banco "Mi Banco"
		
		banco1= new Banco("banco");
        //Añadir un Cliente al Banco nombre=Carlos, Apellidos=Perez, Telefono= 28254435
		
		banco1.anadirCliente("Carlos", "Perez", 28254435);

		//Obtener el cliente
		
		clientes=banco1.getClientes();

		//Crear una cuenta nueva al cliente creado
		clientes[1].asignarCuenta("cuentaCorriente", 150, numcuentas_entrada, 0, 0f);
	}
	@Test
	public void testRetirar() {
		
		//Obtener la cuenta del cliente
		cuentas=clientes[0].getCuentas();
		//llamar al métod retirar
		cuentas[0].retirar(50.00);

		
		// Para comprobar con el assert si el saldo es nuevo llamar a getBalance
		assertArrayEquals("hay error balance", 100, cuentas[0].getBalance());
	}

	@Test
	public void testingresar() {
		cuentas=clientes[0].getCuentas();
		cuentas[0].retirar(100.00);
		assertArrayEquals("hay error balance", 250, cuentas[0].getBalance());

	}

}
