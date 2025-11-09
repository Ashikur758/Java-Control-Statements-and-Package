package mypage;

public class NumberConversionClass {
    public static void convert(int num) {
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
    }
}
