package Lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(abc());

    }
   static int abc(){
        try {
            File f = new File("Test1.txt");
            System.out.println("Объект Файл создался.");
            FileInputStream fis = new FileInputStream(f);
            //return 5;
        }catch (FileNotFoundException e){
            System.out.println("Эксепшн пойман. ");
            return 6;
        }
        finally {
            System.out.println("Это блок файнали.");
            return 7;
        }
    }
}
