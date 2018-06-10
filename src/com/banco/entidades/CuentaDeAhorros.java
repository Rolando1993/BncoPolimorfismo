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
public class CuentaDeAhorros extends Cliente{
    
    private String numeroCuenta;
    private double interes;
    private double saldo;
   
    public CuentaDeAhorros() {
    }

    public CuentaDeAhorros(String numeroCuenta, double interes, double saldo, int codigo, String nombre, String edad) {
        super(codigo, nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.interes = 2.8;
        setSaldo(20.6);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void calcularInteres(){ 
        setSaldo(getSaldo()-(getSaldo()*(this.interes/100))); 
    } 

    @Override
    public String toString() {
        return "CuentaDeAhorros{" + "numeroCuenta=" + numeroCuenta + ", interes=" + interes + ", saldo=" + saldo + '}';
    }
    
    
    
    
}
