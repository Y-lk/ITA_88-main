package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException{

        try {
            File f = new File("Test2.txt");
            System.out.println("Объект Файл создался.");
            FileInputStream fis = new FileInputStream(f);
        }catch (FileNotFoundException e){
            System.out.println("Эксепшн пойман и немного обработан.");
            throw e;
        }
        finally {
            System.out.println("Это блок файнали.");
        }
    }

    void method() {
        try {
            abc();
        }catch (FileNotFoundException e){
            System.out.println("Эксепшн пойман и полностью обработан.");
        }
    }
}
