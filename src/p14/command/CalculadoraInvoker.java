/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14.command;

import java.util.HashMap;

/**
 *
 * @author alzarus
 */
public class CalculadoraInvoker {
    private HashMap<String, Command> operacoes;
    private Command ultimaOperacao;
    private double lastNum;
    
    public CalculadoraInvoker(ResultadoReceiver resultado){
        this.operacoes = new HashMap<String, Command>();
        this.operacoes.put("soma", new Soma(resultado));
        this.operacoes.put("subtracao", new Subtracao(resultado));
    }
    
    public void somar(double num){
        lastNum = num;
        this.operacoes.get("soma").execute(num);
        ultimaOperacao = this.operacoes.get("soma");
    }
    
    public void subtrair(double num){
        lastNum = num;
        this.operacoes.get("subtracao").execute(num);
        ultimaOperacao = this.operacoes.get("subtracao");
    }
    
    public void desfazer(){
        ultimaOperacao.undo(lastNum);
    }
    
}
