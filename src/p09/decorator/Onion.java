/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p09.decorator;

/**
 *
 * @author pedro
 */
public class Onion extends PizzaDecorator{
    
    public Onion(Component component) {
        super(component);
    }
    
    public void mount(){
        this.base.mount();
        System.out.println("Adding Onion to the pizza!");
    }
    
}
