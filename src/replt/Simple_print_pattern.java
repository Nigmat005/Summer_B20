package replt;

public class Simple_print_pattern {



        public static void printHollowRect()
        {
            // write your codes here
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(i==0 || i==4){
                        System.out.print("*");
                    }
                    else if(j==0||j==4){
                        System.out.print("*");

                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


        }

        public static void main(String[] args) {

            printHollowRect();
        }




    }
class gi{
    public static void method(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
       String v="hello";
        method(v);
    }
}

