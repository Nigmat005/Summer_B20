package Wrapper_Class;

import java.util.ArrayList;

public class ArrayList_reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(10);arrlist.add(20);arrlist.add(30);arrlist.add(40);arrlist.add(50);arrlist.add(60);arrlist.add(70);
        for(int i=arrlist.size()-1;i>=0;i--){
            System.out.print(arrlist.get(i)+" ");
        }
    }
}
