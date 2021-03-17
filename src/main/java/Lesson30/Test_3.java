package Lesson30;

public class Test_3 {
    void abc (int i) {System.out.println("int");}
    void abc (byte i) {
        System.out.println("byte");
    }
    void abc (long i){
        System.out.println("long");
    }
    void def (Object o){
        System.out.println("Object");
    }
    void def (String o){
        System.out.println("String");
    }
    void ghi (int a, int b){
        System.out.println("hello 1");
    }
    public static void main(String[] args) {
        Test_3 t = new Test_3();
        t.abc(5);
        t.def("hello");
    }

}
