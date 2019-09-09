/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author pedro
 */
public class LinuxDesigner implements Implementor{

    @Override
    public void drawLine() {
        System.out.println("I draw a line with LinuxDesigner");
    }
    
}
