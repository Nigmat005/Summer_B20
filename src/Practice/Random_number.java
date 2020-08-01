package Practice;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
public class Random_number {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt(100);
        System.out.println(a);
    }
}


// Here ,we are gonna use Math.random(). which only gives you DOUBLE, with a positive sign,random between 0-1
class math_random{
    public static void main(String[] args) {
        double a=Math.random();
        double b =Math.random();
        System.out.println(a);
        System.out.println(b);
        System.out.println(String.format("%.2f",a));
        System.out.println(b);
    }
}
