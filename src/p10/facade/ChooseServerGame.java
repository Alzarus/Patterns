/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10.facade;

/**
 *
 * @author pedro
 */
public class ChooseServerGame {
    private String server;
    
    public ChooseServerGame(String server){
        this.server = server;
    }
    
    public void showServer(){
        System.out.println("You choose the server " + this.server);
    }
}
