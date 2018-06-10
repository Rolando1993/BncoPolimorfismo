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
public class CuentaJoven  extends Cliente{
    
     private double saldo;

    public CuentaJoven() {
    }

    public CuentaJoven(double saldo, int codigo, String nombre, String edad) {
        super(codigo, nombre, edad);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaJoven{" + "saldo=" + saldo + '}';
    }

    
     
    
     
     
}
