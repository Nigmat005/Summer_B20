package replt;

public class Methods_with_return_7_3_locks {

        public boolean threeLocks(boolean a, boolean b, boolean c) {
            boolean boo=true;
            if((a&&b)||c){
               boo=true;
            }else{
                boo=false;
            }
            return boo;


        }//end threeLocks
        public static void main(String[]args){
            boolean a=5>2;
            boolean b=4>1;
            boolean c=a&&b;
            Methods_with_return_7_3_locks obj=new  Methods_with_return_7_3_locks();
            System.out.println(obj.threeLocks(a,b,c));

        }
    }
