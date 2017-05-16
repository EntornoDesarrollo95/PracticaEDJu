package Banco;

public class Cuenta {
    
    private double balance;
    private int numeroCuenta;
    private String tipo;
    
       
    public Cuenta(double balanceInicial, int numeroCuenta, String tipo){
        
        this.balance=0;
        this.tipo=tipo;
        this.numeroCuenta=numeroCuenta;
      
        if (balanceInicial>=100){
            this.balance=balanceInicial;
                   }
        
        else{
            
            System.out.println("La cuenta debe ser abierta con un valor igual o superior a 100 euros");
            
        }
        }
    
    
    public double getBalance(){
        
        return this.balance;
        
    }
    
    // Aumenta el balance de una cuenta en una cantidad
    public void ingresar(double cantidad){
        
        if (cantidad>0){
            
            this.balance=this.balance+cantidad;
            System.out.println("Transacción realizada correctamente.");
            System.out.println("Su nuevo saldo es: "+this.balance+"-- euros");
        }
            
            else
            
            System.out.println("Imposible realizar la transacción, la actualización del saldo debe ser mayor a 0 euros");
        }
    
    // Disminuye el balance de una cuenta en una cantidad
    public void retirar(double cantidad){
        
        if (cantidad<=this.balance){
            
            this.balance=this.balance-cantidad;
            System.out.println("Transacción realizada correctamente.");
            System.out.println("Su nuevo saldo es: "+this.balance+"-- euros ");
        }
            
            else
            
            System.out.println("Imposible realizar la transacción");
        }
    
    //Actualiza el balance en los ingresos y cuando retira
    public void actualizarBalance(double cantidad){
        
                    this.balance=this.balance+cantidad;
       
    }
    
    public String getTipo(){
        
        return this.tipo;
    }
    
    public int getNum(){
        
        return this.numeroCuenta;
    }
    }
    
