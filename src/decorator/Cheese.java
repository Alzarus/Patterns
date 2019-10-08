/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author pedro
 */
public class Cheese extends PizzaDecorator{
    
    public Cheese(Component component) {
        super(component);
    }
    
    public void mount(){
        this.base.mount();
        System.out.println("Adding Cheese to the pizza!");
    }
    
}
