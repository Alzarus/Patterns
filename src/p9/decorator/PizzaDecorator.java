/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9.decorator;

/**
 *
 * @author pedro
 */
public class PizzaDecorator implements Component{
    protected Component base;
    
    public PizzaDecorator(Component component){
        this.base = component;
    }
    
    @Override
    public void mount() {
        this.base.mount();
    }
    
}
