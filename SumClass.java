package mypage;

public class SumClass{
    public static void sum() {  // static method
        double total = 0.0;
        for(double i = 1.0; i >= 0.1; i -= 0.1) {
            total += i;
        }
        System.out.println("Sum of 1+0.9+...+0.1 = " + total);
    }
}
