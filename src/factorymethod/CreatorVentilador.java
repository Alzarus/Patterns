/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author alzarus
 */
public class CreatorVentilador implements ICreator{
    IProduct product;
    
    @Override
    public void create() {
        this.product = new Ventilador();
    }
    
}
