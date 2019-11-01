/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.factorymethod;

/**
 *
 * @author alzarus
 */
public class Ventilador implements IProduct{
    
    public Ventilador(){
        action();
    }
    
    public void action(){
        System.out.println("Ventilador criado!");
    }
        
}
