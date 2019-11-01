/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p03.factorymethod;

/**
 *
 * @author alzarus
 */
public class Sapato implements IProduct{

    public Sapato(){
       action();
    }
    
    public void action(){
        System.out.println("Sapato criado!");
    }
    
}
