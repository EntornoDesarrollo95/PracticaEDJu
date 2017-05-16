package Banco;

public class CuentaAhorros extends Cuenta{
    
    private float interes;
    private String tipo;

public CuentaAhorros(double balInicial,int numeroCuenta, float intereses){
    super(balInicial, numeroCuenta,"Ahorros");
    this.interes=intereses;
    
}

//Le incrementa el balance sumando los intereses qeu genera la cuenta
public void actualizarSaldo(){
    double cantidad;
    cantidad=(super.getBalance()*this.interes)/100;
    super.actualizarBalance(cantidad);
}

public float getInteres(){
    return this.interes;
}
}
