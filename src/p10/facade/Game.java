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
public class Game implements Facade{
    private ChooseServerGame server;
    private ChooseCharacterGame character;
    private LoginGame login;
    
    public Game(String server, String character, String login){
        this.server = new ChooseServerGame(server);
        this.character = new ChooseCharacterGame(character);
        this.login = new LoginGame(login);
    }
    
    @Override
    public void start() {
        this.server.showServer();
        this.character.showCharacter();
        this.login.doLogin();
    }
    
}
