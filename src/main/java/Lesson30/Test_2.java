package Lesson30;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Test_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        //System.out.println(a);
        String s1 = "40";

        int i1 = Integer.parseInt(s1);
        //System.out.println(i1);
        Integer i3 = Integer.valueOf(10);
        Byte b10 = new Byte ((byte) 10);
        System.out.println(i3);
    }
}
