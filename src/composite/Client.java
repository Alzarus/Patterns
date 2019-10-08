/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author pedro
 */
public class Client {
    public static void main(String[] args){
        HouseComposite house = new HouseComposite();
        Bedroom bedroom1 = new Bedroom();
        Bedroom bedroom2 = new Bedroom();
        Kitchen kitchen = new Kitchen();
        
        house.addChild(bedroom1);
        house.addChild(bedroom2);
        house.addChild(kitchen);
        
        house.printInfo();
        
    }
}
