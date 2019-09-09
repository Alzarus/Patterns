/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class HouseComposite implements Component{
    private List<Component> listRooms = new ArrayList<Component>();
    
    @Override
    public void printInfo() {
        for(Component c : this.listRooms){
            c.printInfo();
        }
        System.out.println("This is my house!");
    }
    
    public void addChild(Component component){
        this.listRooms.add(component);
    }
    
    public void removeChild(Component component){
        this.listRooms.remove(component);
    }
    
}
