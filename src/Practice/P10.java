package Practice;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
public class P10 {
    public static void main(String[] args) {
        int[] a = {11, 26, 38, 476, 586585, 656757, 7474, 800, 979, 100000};
        //int[] even = {};
        //int[] odd = {};

        //int [] New  ={};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        System.out.println("Is my numbers empty:  " + numbers.isEmpty());
        System.out.println(numbers);
        //System.out.println(numbers.length);
        int i = 0;
        while (i < a.length)
        {
            numbers.add(a[i]);
            i++;


            System.out.println(numbers);


        }

        System.out.println("numbers is empty "+numbers.isEmpty());
        System.out.println(a[5]);
    }}

