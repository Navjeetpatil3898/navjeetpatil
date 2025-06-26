package Ex_01_Java_Basic;

public class String_MCQ_Exam_1 {
    public static void main(String[] args){
        String String1= "Hello";
        String String2= "hello";
        String String3= "Hello";

        System.out.println("Using == Operator");
        System.out.println(String1==String2);
        System.out.println(String2==String3);
        System.out.println(String3==String1);
        System.out.println();

        System.out.println("Using equlas() method");
        System.out.println(String1.equals(String2));
        System.out.println(String2.equals(String3));
        System.out.println(String3.equals(String1));
        System.out.println();

        System.out.println("Using equalsIgnoreCase() method");
        System.out.println(String1.equalsIgnoreCase(String2));
        System.out.println(String2.equalsIgnoreCase(String3));
        System.out.println(String3.equalsIgnoreCase(String1));
        System.out.println();

        System.out.println("Using compareTo() method");
        System.out.println(String1.compareTo(String2));
        System.out.println(String2.compareTo(String3));
        System.out.println(String3.compareTo(String1));
    }
}
