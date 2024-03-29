/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02.builder;

import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author alzarus
 */
public class Client {

    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor();
        for (int i = 0; i < 10; i++) {
            RandomString session = new RandomString();
            
            byte[] array = new byte[7]; //name length
            new Random().nextBytes(array);
//            supervisor.addEmployee(new Pawn(new String(array, Charset.forName("UTF-8"))));
            supervisor.addEmployee(new Pawn(session.nextString()));
        }

        String result = supervisor.makeProject();
        System.out.println("The result of project was: " + result);
    }
}
