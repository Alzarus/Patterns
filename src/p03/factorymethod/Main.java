/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p03.factorymethod;

/**
 *
 * @author alzarus
 */
public class Main {
    
    public static void main(String[] args){
        ICreator criadorSapato = new CreatorSapato();
        ICreator criadorVentilador = new CreatorVentilador();
        criadorSapato.create();
        criadorVentilador.create();
    }
}
