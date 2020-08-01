package Wrapper_Class;
import  replt.Method_with_return1_countapprance;
public class parse {
    public static void main(String[] args) {
        String a="456";
        int A =Integer.parseInt(a);
        Integer a1=Integer.parseInt(a);// autoboxing
        System.out.println(A);
        System.out.println(a1);

        System.out.println(Integer.valueOf(a));// valueof() method returns wrapper class
        int B=Integer.valueOf(a);// unboxing
        System.out.println(B);
       String invoke=Method_with_return1_countapprance.reverse("hi");


    }
}
