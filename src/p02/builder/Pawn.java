/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02.builder;

/**
 *
 * @author alzarus
 */
public class Pawn implements Builder {

    private String name;

    public Pawn(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("I'm " + this.getName() + ". I work a lot, I need to get an promotion!");
    }

}
