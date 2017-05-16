package Banco;

public class Banco {
    
    private String nombre;
    private int numClientes;
    private Cliente clientes[];
    
    public Banco(String nom){
   
        this.nombre=nom;
        this.numClientes=0;      
        this.clientes=new Cliente[10];
    }
    
    
    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumClientes() {
		return numClientes;
	}


	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}


	public Cliente[] getClientes() {
		return clientes;
	}


	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	//Añades un nuevo cliente al array de clientes del banco

	/*creamos el nuevo clientes:*/
public void anadirClienteNuevo(Cliente cliente){
        
        if (numClientes<5){
            clientes[numClientes]=cliente;
            numClientes=numClientes++;
        }
        else
            
            System.out.println("error: Es imposible ingresar nuevos clientes");
        
    }
/*el cliente que ya estaba*/
	public void anadirCliente(String nom, String apellido, int ced){
            
        if (numClientes<5){
            Cliente client=new Cliente(nom, apellido, ced);
            clientes[numClientes]=client;
            numClientes=numClientes++;
        }
        else
            
            System.out.println("Error!!: Imposible ingresar nuevos clientes");
        
    }

     public static void main(String[] arguments){
        
        Banco banco1=new Banco("Super Banco");
        banco1.anadirCliente("Carlos", "Perez", 28254435);
        banco1.clientes[0].obtenerCuenta();
    }
        
}
