/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p07.bridge;

/**
 *
 * @author pedro
 */
public class Circle implements Abstraction{
    private Implementor designer;

    public Circle(Implementor designer){
        this.designer = designer;
    }
    
    @Override
    public void draw() {
        designer.drawLine();
        System.out.println("I draw an circle!");
    }
    
}
