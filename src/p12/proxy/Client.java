/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12.proxy;

/**
 *
 * @author pedro
 */
public class Client {
    public static void main(String[] args){
        Proxy proxy1 = new Proxy("Albert");
        Proxy proxy2 = new Proxy("Elis");
        
        proxy1.sign();
        System.out.println("-------------------------");
        proxy2.sign();
    }
}
