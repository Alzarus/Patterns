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
public class NokiaVisor implements IVisor{

    @Override
    public void show() {
        System.out.println("Showing the visor, nothing happens.");
    }
    
}
