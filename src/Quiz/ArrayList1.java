package Quiz;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer>list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
       // int a=1;
       Integer a=1;


        System.out.println(list1.remove(a));

        ArrayList<String>list2=new ArrayList<>();
//        list2.add("green");
//        list2.add("red");
//        list2.add("blue");
//        list2.add("yellow");
//        list2.add(3,"cyan");
//        System.out.println(list2);
        list2.add("rob");  list2.add("bran");  list2.add("rick");  list2.add("bran");
        if(list2.remove("bran")){
            list2.remove("john");
        }
        System.out.println(list2);
        System.out.println();
    }
}
