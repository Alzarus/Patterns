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
public class NokiaFactory implements IFactory{

    @Override
    public IMemory getMemory() {
        return new NokiaMemory();
    }

    @Override
    public IVisor getVisor() {
        return new NokiaVisor();
    }
    
}
