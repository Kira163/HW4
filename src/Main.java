import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Температура по фаренгейту");
        System.out.println("Введите температуру по цельсию");
        double cel = new Scanner(System.in).nextDouble();
        int coof1 = 32;
        double coof2 = 1.8;
        System.out.println(cel + " градусов по с это " + (cel * coof2 + coof1));



      /* System.out.println("***Конвертер валют***");

      System.out.println("Введите количество рублей");
      double rubCount = new Scanner(System.in).nextDouble();

      System.out.println("Введите актуальный курс евро: ");
      double eurCurse = new Scanner(System.in).nextDouble();

      System.out.println("Введите актуальный курс доллларов: ");
      double usdCurse = new Scanner(System.in).nextDouble();

      System.out.println(rubCount + " рублей это " + rubCount * (1 / eurCurse) + "eur");
      System.out.println(rubCount + " рублей это " + rubCount * (1 / usdCurse) + "usd");*/








    }
}