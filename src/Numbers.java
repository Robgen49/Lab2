import java.util.Scanner;

public class Numbers {
    public static void PrintValues(){
        System.out.print("Type" + "\t" + "Max value" + "\t".repeat(4) + "Min value");
        System.out.print("\n" + "Byte:" + "\t" + Byte.MAX_VALUE + "\t".repeat(6) + Byte.MIN_VALUE);
        System.out.print("\n" + "Short:" + "\t" + Short.MAX_VALUE + "\t".repeat(5) + Short.MIN_VALUE);
        System.out.print("\n" + "Int:" + "\t" + Integer.MAX_VALUE + "\t".repeat(4) + Integer.MIN_VALUE);
        System.out.print("\n" + "Long:" + "\t" + Long.MAX_VALUE + "\t".repeat(2) + Long.MIN_VALUE);
        System.out.print("\n" + "Double:" + "\t" + Double.MAX_VALUE + "\t" + Double.MIN_VALUE);
        System.out.print("\n" + "Float:" + "\t" + Float.MAX_VALUE + "\t".repeat(3) + Float.MIN_VALUE);
    }
    public static void PrintNumsys(){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число");
        int n = num.nextInt();
        System.out.println("Десятичная система счисления: " + n);
        System.out.println("Двоичная система счисления: " + Integer.toString(n,2));
        System.out.println("Восьмеричная система счисления: " + Integer.toString(n,8));
        System.out.println("Шестнадцатеричная система счисления: " + Integer.toString(n,16));
    }
}
