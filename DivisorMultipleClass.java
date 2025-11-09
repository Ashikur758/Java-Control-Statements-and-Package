package mypage;

public class DivisorMultipleClass {
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
