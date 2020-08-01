package day_02printStatement;

public class Square
 {
    public static void main(String[] args)
    {
    // TODO Auto-generated method stub

    int m = 8;
    for (int i = 1; i <= m; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            if (i == 1 || i == m)
                System.out.print(" *");
            else if (j == 1 || j == m)
                System.out.print(" *");
            else
                System.out.print("  ");
        }
        System.out.println(" ");
    }
}
}

class  another
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int m = 8;
        for (int i = 1; i <= m; i++)
            if (i == 1 || i == m) {
                System.out.print(" *");
            } else
                    System.out.print("  ");

    }

}

class c_f
{
    public static void main(String args[]) {

        for(int x = 10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}



