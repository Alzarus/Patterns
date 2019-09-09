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
public class Proxy implements Person{
    private RealPerson realPerson;
    private String name;
    
    public Proxy(String name){
        this.name = name;
    }
    
    @Override
    public void sign() {
        if(this.realPerson == null){
            this.realPerson = new RealPerson(this.name);
        }
        this.realPerson.sign();
    }
    
}
