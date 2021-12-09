package cuentaBancaria;
/**
 * Modela una cuenta bancaria
 * 
 *
 */
public class Cuenta
{
    private int numeroCuenta; 
    private String titular;
    private double saldo;

    /**
     * Constructor para los objetos de la clase Cuenta
     * @param  nuevoNumero  el nuevo n�mero de cuenta
     */
    public Cuenta(int numeroCuenta, String titular)
    {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        saldo = 0;
    }

    /**
     * mutador para el n� de cuenta
     * @param  nuevoNumero  el nuevo n�mero de cuenta
     */
    public void setNumeroCuenta(int nuevoNumero)
    {
        numeroCuenta = nuevoNumero;
    }
    
    /**
     * accesor para el n� de cuenta
     */
    public int getNumeroCuenta() 
    {
        return numeroCuenta;
    }
    
    /**
     *  ingresar dinero en la cuenta
     *  @param cantidad   cantidad a ingresar
     */
    public void ingresar(double cantidad) 
    {
        if (cantidad > 0)
        {
            saldo = saldo + cantidad;
        }
    }
    
    /** 
     * reintegrar dinero de la cuenta
     * @param cantidad  la cantidad a reintegrar
     */
    public void reintegrar(double cantidad) 
    {
         if (cantidad <= saldo)
         {
            saldo = saldo - cantidad;
        }
    } 

    
    /** 
     * accesor para el saldo de la cuenta
     */
    public double getSaldo() 
    {
        return saldo;
    }
 

    /**
     * visualizar datos de la cuenta
     */
    public String toString()
    {
        String tmp = "";
        
        tmp = tmp + "\nN�mero de cuenta: " + numeroCuenta 
                  + "\nTitular: " + titular 
                  + "\nSaldo: " + saldo;
        return tmp;
    }
    
}
