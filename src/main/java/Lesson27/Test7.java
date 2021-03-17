package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {
    public static void main(String[] args) {
        System.out.println(abc());
    }
    static int abc(){
        int a=5;
        try {
            File f = new File("Test2.txt");
            System.out.println("Объект Файл создался.");
            FileInputStream fis = new FileInputStream(f);
            //return 5;
        }catch (FileNotFoundException e){
            System.out.println("Эксепшн пойман. ");
            System.out.println("Переменная в кэтч блоке равна " + a);
            return a;
        }
        finally {
            a=10;
            System.out.println("Это блок файнали.");
            System.out.println("Переменная в файнали блоке равна " + a);
        }
        return a;
    }
}
