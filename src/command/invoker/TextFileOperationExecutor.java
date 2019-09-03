/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoker;

import java.util.ArrayList;
import java.util.List;
import command.TextFileOperation;

/**
 *
 * @author aluno
 */
public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations
            = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
