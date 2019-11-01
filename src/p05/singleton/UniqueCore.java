/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05.singleton;

/**
 *
 * @author alzarus
 */
public class UniqueCore{
    private static UniqueCore INSTANCE = null;
    
    private UniqueCore(){
        
    }

    public static UniqueCore getInstance() {
        if(INSTANCE == null){
            INSTANCE = new UniqueCore();
        }
        return INSTANCE;
    }
}
