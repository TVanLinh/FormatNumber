package test;

import org.apache.commons.lang.math.NumberUtils;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CommonUtils {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatHour(0.324));
        System.out.println(formatHour(0.345));
        System.out.println(formatHour(0.345));
        System.out.println(formatHour(1));
        System.out.println(formatHour(-1));

        System.out.println(formatHour(-0.995));
        System.out.println(formatHour(0.995));
        System.out.println(formatHour(9999.995));
        System.out.println(formatHour(9999.996));
        System.out.println("=================================S");
        System.out.println(formatHour("0.324"));
        System.out.println(formatHour("0.345"));
        System.out.println(formatHour("0.345"));
        System.out.println(formatHour("1"));
        System.out.println(formatHour("-1"));

        System.out.println(formatHour("-0.995"));
        System.out.println(formatHour("0.995"));
        System.out.println(formatHour("9999.995"));
        System.out.println(formatHour("9999.996"));

        System.out.println(formatHour("-0.017"));
    }

    /**
     * Round value to format
     * 1.00 -> return 1;
     * 0.995 -> 1
     * -0.995 -> -1
     * 0.324 -> 0.32
     * 0.345 -> 0.35
     * 0.326-> 0.33
     * @param value
     * @return
     */
    public static String formatHour(double value) {
        String result = String.format("%.2f", value).replace(".00", "");
        if ("-0".equals(result)) {
            return String.valueOf(0);
        }
        return result;
    }

    public static String formatHour(String value) {
        double number = NumberUtils.toDouble(value, 0);
        return formatHour(number);
    }
}
