package Practice;

public class Devision_without_sign {
    public static void My_method(int a,int b){
        final int A=a;
        System.out.println(a);
        if(b!=0){
            int num=0;
            while(a-b>=0){
                num++;
                a-=b;
            }
            System.out.println(A+" devided by "+b+" is "+num+" with remainder "+a);
            System.out.println(a);
            System.out.println(A);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        My_method(20,3);
    }
}
