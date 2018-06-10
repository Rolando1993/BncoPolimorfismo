/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.entidades;

/**
 *
 * @author DUALPC
 */
public class CuentaCorriente extends Cliente{
    
    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String numeroCuenta, double saldo, int codigo, String nombre, String edad) {
        super(codigo, nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresarSaldo(double ingreso){ 
        this.saldo += ingreso; 
    } 
    public void reintegrarSaldo(double salida){ 
        this.saldo -= salida; 
    } 
    
    public boolean cuentasIguales(CuentaCorriente cuenta){ 
        boolean iguales = false; 
        if(this.numeroCuenta.equals(cuenta.getNumeroCuenta())){ 
            iguales = true; 
        } 
        return iguales; 
    } 

    @Override
    public String toString() {
        return "CuentaCorriente{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }

    
    
    
    
}
