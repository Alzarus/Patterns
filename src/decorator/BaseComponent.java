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
public class BaseComponent implements Component{

    @Override
    public void mount() {
        System.out.println("This is the pizza's base!");
    }
    
}
