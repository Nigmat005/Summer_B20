package Practice;

public class Someone_age {
    public static void main(String[] args) {
        int Age=30;
        boolean age= Age>= 18&& Age<=150;
        String st1="";
        if(age){
            if(Age>=21 && Age<=51){
                st1="adult";
            }
            else if(Age>51 && Age<=71){
                st1="Senior";
            }
            else
            {
                st1="enn";
            }
        }else{
            st1="Please enter valid int";
        }
        System.out.println(st1);
    }
}
