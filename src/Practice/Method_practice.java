package Practice;

import org.w3c.dom.ls.LSOutput;

public class Method_practice {
    public static void main(String[] args) {
        System.out.println("Method is coming");
        My_method();
        System.out.println("My_method Worked successfully");
    }
    private static void My_method(){
        System.out.println("It is coming from inside of My_method");
    }
}


abstract class My_method_2{
    public static void main(String[] args) {
      int result;
      result=Method();
        System.out.println("The value is: "+result);
    }
    static int Method(){

        return (10*100);
    }




}

class My_method_3{
    public static void main(String[] args) {
    int result=method();

        System.out.println("using method "+method());
        System.out.println("using method "+result);

        }
    static int method(){
        int result;
        return result=10*10;


    }




}

class My_method_4{
   static int Method(){

       return  100*500;

   }

    public static void main(String[] args) {

        int result=Method();
        System.out.println(Method());
        Method();
    }


}

class Method_5 {

    public static void main(String[] args) {
        int result, i;

        i = 3;
        result = square(i);
        System.out.println("Square of 3 is: " + result);

        i = 4;
        result = square(i);
        System.out.println("Square of 4 is: " + result);
    }

    // method
    static int square(int i) {
        return i * i;
    }
}

class method_6{
    static int square(int a){
        return a*a;
    }

    public static void main(String[] args) {
        int b;
         b=5;
        square(b);
        System.out.println("Square of 5 is: "+square(b));
         int a;
         a=6;
        square(a);
        System.out.println("Square of 5 is: "+square(a));

    }
}

class multi{
    public static int Multiform(int i, int j){
        for(i=9;i>0;i--){
          for(j=9;j>0;j--){
              System.out.print(i+" * "+j+" = "+i*j+"\n");
          }
        } return (i*j);

    }

    public static void main(String[] args) {
        Multiform(9,9);
    }
}