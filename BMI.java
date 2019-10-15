package podstawyJęzykaJava;

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        System.out.println("Podaj swoją wagę w kilogramach.");
        double waga;
        Scanner scanner = new Scanner (System.in);
        waga = scanner.nextDouble();
        System.out.println("Podaj swój wzrost w centymetrach.");
        double wzrost;
        wzrost = scanner.nextDouble();
        double bmi;
        bmi = waga / Math.pow((wzrost / 100), 2);
        System.out.printf("Twój wskaźnik BMI wynosi: %.2f \n\n", bmi);
        if (bmi<18.5)
        {
            System.out.println("Niestety masz niedowagę. Powinieneś przytyć.");
        }
        else if (18.5 <= bmi && bmi < 25)
        {
            System.out.println("Gratulacje. Masz prawidłową wagę.");
        }
        else {
            System.out.println("Niestety masz nadwagę. Powinieneś schudnąć grubasie.");
        }
    }
}
