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
public class Client {
    public static void main(String[] args){
        Component pizza1 = new Onion(new Cheese(new BaseComponent()));
        Component pizza2 = new Cheese(new BaseComponent());
        
        pizza1.mount();
        System.out.println("--------------------");
        pizza2.mount();
    }
}
