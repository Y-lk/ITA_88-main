package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(abc());
    }

    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("Privet");
        try {
            File f = new File("Test2.txt");
            System.out.println("Объект Файл создался.");
            FileInputStream fis = new FileInputStream(f);

        }catch (FileNotFoundException e){
            System.out.println("Эксепшн пойман. ");
            System.out.println("Переменная в кэтч блоке равна " + a);
            return a;
        }
        finally {
            a.append("!!!");
            System.out.println("Это блок файнали.");
            System.out.println("Переменная в файнали блоке равна " + a);
        }
        return a;
    }
}
