package replt;
import java.util.*;
public class Brger_chicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();

        //your code here
        float price=0;
        boolean meal=in.equalsIgnoreCase("bueger")||in.equalsIgnoreCase("chicken");
        if(meal){
            price=10;
        }else if(in.equalsIgnoreCase("soda")){
            price=2;
        }else{
            System.out.println("Invalid");
        }

        System.out.println(price);

}
}

