package Lesson30;

public class Test_4 {
    static void abc (String s){
        System.out.println("A");
    }
    static void abc (String ... s) {
        System.out.println("B");
    }
    static void abc (Object s){
        System.out.println("C");
    }
    static void abc (String s1,String s2){
        System.out.println("D");
    }


    public static void main(String[] args) {
        Test_4 t= new Test_4();
        t.abc("ok","!!!","33");
    }
}
