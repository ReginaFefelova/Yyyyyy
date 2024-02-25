import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int prise, miles, kol;
        kol = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость билета: ");
        prise = scanner.nextInt();
        miles = prise / kol;

        System.out.println("Количество начисленных Вам миль за купленный билет: " + miles);

    }
}
