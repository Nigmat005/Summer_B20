package Practice;
import java.util.Scanner;
public class Time_countdown {
    public static void main(String[] args) throws Exception{
        Scanner Time_scan = new Scanner(System.in);
        System.out.println("Please enter the time you wanna be counted down");
        if (Time_scan.hasNextInt()) {
            int input=Time_scan.nextInt();
            for(int i=input;i>0;--i){
                if(i<0) {
                    break;
                }

                for(int j=59;j>0;--j){
                    System.out.println((i-1)+" Minutes "+j+" Seconds"+" left");
                    Thread.sleep(1000);

                }

            }
        }Time_scan.close();
    }
}