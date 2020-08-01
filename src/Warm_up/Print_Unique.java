package Warm_up;

public class Print_Unique {
    public static void main(String[] args) {
        String [] Array={"A","B","B","C","C","C"};
       int num=0;
        for(String each:Array){
            if(each==each){
                num+=1;
            }if(num==1){
                System.out.println(each);
        }

        }
    }
}


class Print_Unique1 {
    public static void main(String[] args) {
        String [] Array={"A","B","C","C","C"};
       for(String other:Array){//
           int num=0;
           for(String each:Array){
               if(other==each){
                   num+=1;
               }
           }
           if(num==1){
               System.out.println(other);
           }
       }


        }
    }

