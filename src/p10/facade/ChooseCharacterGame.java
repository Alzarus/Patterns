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
public class ChooseCharacterGame {
    private String character;
    
    public ChooseCharacterGame(String character){
        this.character = character;
    }
    
    public void showCharacter(){
        System.out.println("You choose the character " + this.character);
    }
}
