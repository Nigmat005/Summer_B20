package part1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Data_type
{
    public static void main(String[] args) {
        // From small size to big size for primitive data type
        //byte(0)--->short(0)--->char(0)--->int(0)--->long(l/L)--->float(f/F)--->double(d/D)
    /*When we do Data type casting, There aer two different scenarios, which are "Widening Casting" and "Narrowing Casting respectively ",
     for Widening Casting, it will be done automatically, for narrowing casting we need to do it manually. Bellow are examples*/
        //lets do widening casting first, always remember its auto processed.
        int a = 5;
        System.out.println(a);
        System.out.println((byte)a); // it gives you 5.
        // but I wanna float like 5.0
        double my_double =a;
        float my_float1=a;
        System.out.println(my_float1);

        System.out.println(my_double);

        //lets do one more time using "byte"
        byte b= 100;
        System.out.println(b);
        int my_int=b;
        System.out.println(my_int);
        float my_float=b;
        System.out.println(my_float);
        char my_char= (char) b;
        System.out.println(my_char);
        byte c=112;
        System.out.println((char)c);


        // Narrowing Casting(manually)
        double db=40876.5;
        System.out.println((int)db); //gives you 40876
        // Specifically
        double db1= 503948.7;
        int intdb1= (int)db1;
        System.out.println(intdb1);
        String str="Hi";
        str.getClass().getSimpleName();

    }
}

class PrimitiveTypeTest
{
    public static void main(String[] args)
    {
     //byte
        System.out.println("基本类型:byte 二进制位数:"+ Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE"+Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE"+ Byte.MAX_VALUE);
        System.out.print("\n");

        //short
        System.out.println("基本类型：short 二进制位数："+Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值:"+Short.MIN_VALUE);
        System.out.println("最大值:"+Short.MAX_VALUE);
        System.out.print("\n");

        //int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();


        //long
        System.out.println("基本类型：long 二进制位数："+Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值:"+Long.MIN_VALUE);
        System.out.println("最大值:"+Long.MAX_VALUE);
        System.out.print("\n");

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);



    }
}