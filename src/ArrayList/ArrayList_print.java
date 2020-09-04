package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_print {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(30);
        list1.add(410);
        list1.add(310);
        list1.add(210);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int each  : list1){

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

// collection Max and Min
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));



    }
}



class testOriginal_Remove{
    public static void main(String[] args) {
        ArrayList<String>StringList=new ArrayList<>();
        String[] stringarr={"HI","HI","Apple","Banana","Orange","Apple","Peach","Orange"};
        StringList.addAll(Arrays.asList(stringarr));
        System.out.println(StringList);
        // remove All duplicate element using removeif()method

//       StringList.removeIf(p-> Collections.frequency(StringList,p)!=1);
//        System.out.println(StringList);
//        System.out.println(StringList.contains("Banana"));

// Traditional Method
        ArrayList<String>result=new ArrayList<>();

        for(int i=0;i<StringList.size();i++){
           if(!result.contains(StringList.get(i))){
               result.add(StringList.get(i));
           }
        }
        System.out.println(result);


    }
}