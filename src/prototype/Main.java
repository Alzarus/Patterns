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
public class Main {
    
    public static void main(String[] args){
        Banana banana1 = new Banana("Amarela", 5);
        Banana banana2 = (Banana) banana1.clone();
        banana1.show();
        System.out.println("--------------------");
        banana2.show();
    }
}
