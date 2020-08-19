package Formatter;

import java.text.DecimalFormat;

public class Decimal_Formatter {

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        double d = 4.0;
        System.out.println(formatter.format(d));
        System.out.println(String.format("%,.2f",4.678));
    }

}
