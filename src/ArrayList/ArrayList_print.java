package ArrayList;
import java.util.ArrayList;
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


    }
}
