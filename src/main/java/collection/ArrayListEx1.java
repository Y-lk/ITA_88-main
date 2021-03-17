package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Yury");
        arrayList1.add("Anna");
        arrayList1.add(1,"Misha"); //Миша отправился на позицию 1.
        for (String s:arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList1.get(2)); //Под индексом 2 находится Юра.
        for (int i = 0; i<arrayList1.size();i++){
            System.out.print(arrayList1.get(i) + " \n");
        }
        arrayList1.set(1,"Masha");
        System.out.println(arrayList1);
    }
}
