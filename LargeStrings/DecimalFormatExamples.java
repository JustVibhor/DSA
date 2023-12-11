package LargeStrings;

import java.text.DecimalFormat;

public class DecimalFormatExamples {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.println(decimalFormat.format(3.4));
    }
}