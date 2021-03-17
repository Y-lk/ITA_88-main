package Exceptions;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        File f = new File("test1.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Файл найден.");
        fis.read();
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(100);
    }
}
