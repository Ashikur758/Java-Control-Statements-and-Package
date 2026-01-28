Package ict.22.ClassNames

class SumClass {
    public static void sum() {
        double total = 0.0;
        for(double i = 1.0; i >= 0.1; i -= 0.1) {
            total += i;
        }
        System.out.println("Sum of 1+0.9+...+0.1 = " + total);
    }
}

class DivisorMultipleClass {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void print(int a, int b) {
        System.out.println("GCD of "+a+" and "+b+" = " + gcd(a,b));
        System.out.println("LCM of "+a+" and "+b+" = " + lcm(a,b));
    }
}

class NumberConversionClass {
    public static void convert(int num) {
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
    }
}

class CustomPrintClass {
    public void pr(String msg) {
        System.out.println(msg);
    }
}

public class MainClass {
    public static void main(String[] args) {
        SumClass.sum();
        DivisorMultipleClass.print(12, 18);
        NumberConversionClass.convert(255);
        CustomPrintClass c = new CustomPrintClass();
        c.pr("Hello World!");

        int i = 1;
        do {
            System.out.println("Do-While Loop iteration: " + i);
            i++;
        } while(i <= 3);
    }
}
