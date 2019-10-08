package command.command;

import command.receiver.TextFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    public String execute() {
        return textFile.open();
    }

}
