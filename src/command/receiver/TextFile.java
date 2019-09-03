package receiver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    
    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

}
