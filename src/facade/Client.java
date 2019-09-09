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
public class Client {
    public static void main(String[] args){
        Game game = new Game("Valento", "Shaman", "Alzarus");
        game.start();
    }
}
