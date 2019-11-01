/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandnew;

/**
 *
 * @author alzarus
 */
public class Soma implements Command {

    private ResultadoReceiver resultado;
    
    public Soma(ResultadoReceiver resultado){
        this.resultado = resultado;
    }

    @Override
    public void execute(double num) {
        this.resultado.somar(num);
    }

    @Override
    public void undo(double num) {
        this.resultado.subtrair(num);
    }
}
