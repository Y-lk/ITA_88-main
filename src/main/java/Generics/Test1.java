package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("Poka"));
        list.add("Privet");
        list.add("Poka");
        list.add("kY");
        list.add("Pi");
        //list.add(new Test1());

        for(Object o : list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }

    }
}
