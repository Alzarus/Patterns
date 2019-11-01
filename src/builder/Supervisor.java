/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alzarus
 */
public class Supervisor {
    private List<Pawn> employees;
    
    public Supervisor(){
        this.employees = new ArrayList<Pawn>();
    }
    
    public void addEmployee(Pawn employee){
        this.employees.add(employee);
    }

    public List<Pawn> getEmployees() {
        return employees;
    }
    
    public String makeProject(){
        if(this.employees == null){
            return "No employees with the supervisor. He cannot do anything alone.";
        } else {
            for(Pawn p : this.getEmployees()){
                p.work();
            }
            return "All the employees had worked.";
        }
    } 
    
}
