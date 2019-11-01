/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14.command;

/**
 *
 * @author alzarus
 */
public interface Command {
    public void execute(double num);
    public void undo(double num);
}
