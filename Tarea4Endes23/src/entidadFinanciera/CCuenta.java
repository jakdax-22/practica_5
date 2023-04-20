/**
 * @author Enrique Iranzo
 * @version 4.0
 * Contiene la información de cada cuenta 
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CCuenta {
    //Atributos
    
    /**
     * Nombre de la cuenta
     */
    private String nombre;
    /**
     * Numero de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés de la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los parámetros de la clase
     * @param nom nombre de la cuenta
     * @param cue numero de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * LLama al método getSaldo() para sacar el saldo de la cuenta y lo devuelve
     * @return @see getSaldo()
     */
    public double estado(){
        return this.getSaldo();
    }
    /**
     * Coge por parámetro una cantidada y la ingresa en el saldo de la cuenta
     * @param cantidad cantidad a ingresar
     * @throws Exception @see getSaldo() si el saldo ingresado es negativo salta la excepción
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Constante para refactorizar código
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    /**
     * Recoge una cantidad por parámetro y la retira de la cuenta
     * @param cantidad
     * @throws Exception @see getSaldo() Si la cantidad retirada es negativa o no hay suficiente saldo en la cuenta saltará la excepción
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Get del nombre de la cuenta 
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /** Set del nombre
     * @param nombre el nuevo nombre de la cuenta 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Get del número de la cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Set del número de la cuenta 
     * @param cuenta nuevo número de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Get del saldo de la cuenta 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** Set del ´saldo de la cuenta
     * @param saldo nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


    
   