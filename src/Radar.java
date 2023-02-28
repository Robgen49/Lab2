import java.util.Scanner;

public class Radar {
    public static void Seek() {
        Scanner R = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        double xnate;
        double ynate;
        double range;
        double Range;
        while (true) {
            System.out.println("Введите R");
            Range = R.nextDouble();
            System.out.println("Введите r");
            range = r.nextDouble();
            System.out.println("Введите x");
            xnate = x.nextDouble();
            System.out.println("Введите y");
            ynate = y.nextDouble();
            if (Range > range && Range > 0 && range > 0)
                break;
            else
                System.out.println("Данные введены некорректно, попробуйте снова.");
        }
        if (Math.sqrt(xnate * xnate + ynate * ynate) <= range)
            System.out.print("Тревога!");
        if (Math.sqrt(xnate * xnate + ynate * ynate) > range && Math.sqrt(xnate * xnate + ynate * ynate) <= Range)
            System.out.print("Обнаружен");
        if (Math.sqrt(xnate * xnate + ynate * ynate) > Range)
            System.out.print("Не обнаружен");
    }
}
