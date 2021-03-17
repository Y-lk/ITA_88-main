package collection;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "muka";
        List<Character> list = new LinkedList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalinsrome = true;
        while (iterator.hasNext()&&reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalinsrome = false;
                break;
            }
        }
        if(isPalinsrome){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("NOT palindrom");
        }
    }
}
