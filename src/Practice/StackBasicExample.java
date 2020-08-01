package Practice;
import java.util.Stack;
public class StackBasicExample {
     public static void main(String [] args){
            Stack<Integer> stack = new Stack<>();
            System.out.println("Empty stack : "  + stack);
            System.out.println("Empty stack : "  + stack.isEmpty());
            // Exception in thread "main" java.util.EmptyStackException
            // System.out.println("Empty stack : Pop Operation : "  + stack.pop());
            stack.push(1001);
            stack.push(1002);
            stack.push(1003);
            stack.push(1004);
            stack.clear();
            System.out.println("Non-Empty stack : "  + stack);
            System.out.println("Non-Empty stack: Pop Operation : "  + stack.pop());
            System.out.println("Non-Empty stack : After Pop Operation : "  + stack);
            System.out.println("Non-Empty stack : search() Operation : "  + stack.search(1002));
            System.out.println("Non-Empty stack : "  + stack.isEmpty());
            System.out.println("Empty stack"+ stack.isEmpty());
         //int [] a={11,26,38,476,586585,656757,7474,800,979,100000};
         //int [] even ={};
         //int [] odd  ={};
         //while(a.length>0);{

        }
}

class quiz{
       public static void main(String[] args) {
              long a=30l;
              long b=(short)a;
              System.out.println(b);
              System.out.println("5+2="+3+4);
              System.out.println("5+2="+(3+4));
              float a1=100.787979f;
              short b1=(byte)a1;
              byte c= (byte)b1;
              System.out.println(c);
              System.out.println(10/3.0);
              long a2=3000l;
              double b2=(float)a2;
              int c1=(short)b2;
              System.out.println(c1%1000);
              System.out.println(5*2/3%2);
              System.out.println("result a="+0+1);
              System.out.println("result b="+(1)+(2));

       }
}

