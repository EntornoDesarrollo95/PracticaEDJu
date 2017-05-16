package Banco;

public class CuentaCorriente extends Cuenta{
    
    private double sobregiro;
    private double disponible;
        
     public CuentaCorriente(double balInicial,int numeroCuenta, double sobre){
       
        super(balInicial,numeroCuenta,"Corriente");
        this.sobregiro=sobre;
        this.disponible=balInicial+sobre;
        
     }
     
    @Override
     public void retirar(double cantidad){
        this.disponible=this.getBalance()+this.sobregiro; 
        if (cantidad<=(this.disponible)){
            this.disponible=this.disponible-cantidad;
            this.actualizarBalance(this.disponible);
            System.out.println("Transacción realizada correctamente.");
            System.out.println("Usted ha retirado $"+cantidad+"-- euros. Su nuevo saldo es: $"+this.getBalance()+"-- pesos");
            if (this.getBalance()<0)
                System.out.println("!!Atención¡¡ Su saldo esta en rojo");
        }
            
            else
            
            System.out.println("Imposible realizar la transacción");
        }
    
      
         
     }
