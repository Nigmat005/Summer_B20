package Practice;
import java.util.Scanner;

public class ScannerDemo {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            double sum = 0;
            int m = 0;

            while (scan.hasNextDouble()) {
                double x = scan.nextDouble();
                //System.out.println(m);
                System.out.println(m);
                m = m + 1;
                sum = sum + x;
                System.out.println(m);


            }

            System.out.println(m + "个数的和为" + sum);
            System.out.println(m + "个数的平均值是" + (sum / m));
            scan.close();
        }
    }

class while_Loop{
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

}