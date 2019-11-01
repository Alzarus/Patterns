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
public class ResultadoReceiver {
    
    private double resultado;
    
    public ResultadoReceiver(){
        this.resultado = 0;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    
    public void somar(double num){
        this.resultado += num;
    }
    
    public void subtrair(double num){
        this.resultado -= num;
    }
}
