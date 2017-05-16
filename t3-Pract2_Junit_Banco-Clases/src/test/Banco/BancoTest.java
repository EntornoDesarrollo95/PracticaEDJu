package test.Banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Banco.Banco;
import Banco.Cliente;

public class BancoTest {
	/*aqui faltan los private */
	private  Banco banco;
    private Cliente clientes[];
	@Before
	public void CrearBanco()
	{
       /*creamos el banco*///
		banco = new Banco("banco");
	}

	@Test
	public void testanadirCliente() {
		
		// test/*anadimos un cliente con los mismo datos de la clase banco*/
		banco.anadirCliente("Carlos", "Perez", 28584435);
		assertEquals("carlos perez", "carlos kk", clientes[0].getNombre());
	}

}
