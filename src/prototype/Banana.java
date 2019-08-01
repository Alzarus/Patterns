/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author alzarus
 */
public class Banana implements IPrototype{

    private String color;
    private int size;
    
    public Banana(String color, int size){
        this.color = color;
        this.size = size;
    }
    
    public void show(){
        System.out.println("Color = " + this.color);
        System.out.println("Size = " + this.size);
    }
    
    @Override
    public IPrototype clone() {
        return new Banana(this.color, this.size);
    }
    
}
