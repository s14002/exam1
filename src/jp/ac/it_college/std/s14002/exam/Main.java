package jp.ac.it_college.std.s14002.exam;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.IOException;
import java.util.Scanner;

import jp.ac.it_college.std.nakasone.lib.exam.Communicator;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("名前: ");
        String name = sc.next();
        Communicator com = new Communicator((msg) -> {
            System.out.println("Message from Server: " + msg);
        });
        com.start();


        while (true) {
            try {
                System.out.print("入力してください: ");
                String input = sc.next();
                if (input.equals("q")) {
                    com.finish();
                    System.exit(0);
                    break;
                } else {
                    com.send(name + " : " + input);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
