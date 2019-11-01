/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.abstractfactory;

/**
 *
 * @author alzarus
 */
public class NokiaMemory implements IMemory{

    @Override
    public void getDetails() {
        System.out.println("You have a Nokia memory with 6GB!");
    }
    
}
