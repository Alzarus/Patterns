/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author pedro
 */
public class RealPerson implements Person{
    private String name;
    
    public RealPerson(String name){
        this.name = name;
    }

    @Override
    public void sign() {
        System.out.println(this.name + " has sign the document.");
    }
    
}
