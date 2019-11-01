/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1.abstractfactory;

/**
 *
 * @author alzarus
 */
public class Main {
    public static void main(String[] args){
        IFactory factory = new NokiaFactory();
        factory.getMemory().getDetails();
        factory.getVisor().show();
    }
}
