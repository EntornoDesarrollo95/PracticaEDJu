package Banco;

public class Cliente {

	private String nombre;
	private String apellido;
	private int cedula;
	private Cuenta cuentas[];
	private int numCuentas;

	public Cliente(String nom, String ape, int ced) {

		this.nombre = nom;
		this.apellido = ape;
		this.cedula = ced;
		this.numCuentas = 0;
		this.cuentas = new Cuenta[3];
	}

	// Obtiene en un String concatenado el nombre y el apellido

	public String getNombre() {
		String nombreapellido = this.nombre + " " + this.apellido;
		return nombreapellido;

	}

	// Añade una nueva cuenta la cliente en su array de cuentas
	public void asignarCuenta(String tipoCuenta, double balance, int numcta, double s, float inter) {

		// Cuenta cta=new Cuenta(100,tipoCuenta);

		if (tipoCuenta.equals("Ahorros")) {

			if (numCuentas < 3) {
				CuentaAhorros cuenta = new CuentaAhorros(balance, numcta, inter);
				this.cuentas[numCuentas] = cuenta;
				this.numCuentas++;

			} else
				System.out.println("El cliente ya posee un maximo de cuentas, imposible asiganr otra cuenta");

		} else

		if (tipoCuenta.equals("Corriente")) {

			if (numCuentas < 3) {
				CuentaCorriente cuenta = new CuentaCorriente(balance, numcta, s);
				this.cuentas[numCuentas] = cuenta;
				this.numCuentas = this.numCuentas++;
			} else
				System.out.println("El cliente ya posee un maximo de cuentas, imposible asignar otra cuenta");

		}

	}

	// Obtiene en un array los numeros de cuenta de un Cliente, y mustra por
	// pantalla los daos de la cuenta
	public Integer[] obtenerCuenta() {
		int i = 0;
		int j = cuentas.length;
		Integer[] num_cuentas = new Integer[3];

		while (i < j) {
			if (cuentas[i] != null) {
				System.out.println("Numero de cuenta: " + cuentas[i].getNum());
				System.out.println("Tipo de cuenta: " + cuentas[i].getTipo());
				System.out.println("Saldo: " + cuentas[i].getBalance());
				num_cuentas[i] = cuentas[i].getNum();
				System.out.println("Numero array de cuenta: " + num_cuentas[i]);

			}
			i++;
		}
		return num_cuentas;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

}
