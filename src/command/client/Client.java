/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.client;

import command.command.OpenTextFileOperation;
import command.command.SaveTextFileOperation;
import command.invoker.TextFileOperationExecutor;
import command.receiver.TextFile;

/**
 *
 * @author aluno
 */
public class Client {

    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
    }

}
