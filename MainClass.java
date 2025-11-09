import mypage.*;

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
