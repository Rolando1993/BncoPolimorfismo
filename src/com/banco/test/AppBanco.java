/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.test;

import com.banco.entidades.Cliente;
import com.banco.entidades.CuentaCorriente;
import com.banco.entidades.CuentaDeAhorros;
import com.banco.entidades.CuentaJoven;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUALPC
 */
public class AppBanco {
    
    public static void main(String[] args) {
        
        CuentaJoven cj = new CuentaJoven(200.0, 100, "Rolando", "25");
        CuentaCorriente cc1 = new CuentaCorriente("10001", 1500.0, 200, "Maria", "18"); 
        CuentaCorriente cc2 = new CuentaCorriente("20001", 3500.0, 300, "Angie", "20"); 
        CuentaDeAhorros ch = new CuentaDeAhorros("3000001", 12.3, 56789.89, 400, "Viviana", "19"); 
        System.out.println("Saldo Viviana: " + ch.getSaldo()); 
        ch.calcularInteres(); 
        System.out.println("El Saldo es : " + ch.getSaldo());
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cj);
        listaClientes.add(cc1);
        listaClientes.add(cc2);
        listaClientes.add(ch);
        System.out.println(listaClientes);
        
        
    }
}
