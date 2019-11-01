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
public class Client {
    public static void main(String[] args){
        Implementor designer = new LinuxDesigner();
        Abstraction drawing = new Circle(designer);
        drawing.draw();
    }
}
