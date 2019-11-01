/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14.command;

/**
 *
 * @author alzarus
 */
public class Client {

    public static void main(String[] args) {
        ResultadoReceiver resultado = new ResultadoReceiver();
        CalculadoraInvoker calculadora = new CalculadoraInvoker(resultado);
        
        calculadora.somar(10);
        System.out.println(resultado.getResultado());
        
        calculadora.somar(50);
        System.out.println(resultado.getResultado());
        
        calculadora.desfazer();
        System.out.println(resultado.getResultado());
        
        calculadora.subtrair(5);
        System.out.println(resultado.getResultado());
        
        calculadora.subtrair(3);
        System.out.println(resultado.getResultado());
        
        calculadora.desfazer();
        System.out.println(resultado.getResultado());
    }
}
