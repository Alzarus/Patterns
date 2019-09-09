/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author pedro
 */
public class LoginGame {
    private String user;
    
    public LoginGame(String user){
        this.user = user;
    }
    
    public void doLogin(){
        System.out.println("You made the login with the " + this.user + " account");
    }
}
