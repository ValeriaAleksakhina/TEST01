import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in); // взять от пользователя значение и запомнить
        int num = sc.nextInt(); // или nextLine, если это строка или просто next если считать символ
        int arProgr = 1;
        int geProgr = 1;
        for (int i = 2; i <= num; i++) {
            arProgr += i;
            geProgr *= i;
        }
        System.out.printf("Сумма арифм прогрессии = %d\n", arProgr);
        System.out.printf("Сумма геометр прогрессии = %d\n", geProgr); //%d - переменная, кот будет вставлена после запятой(класса Integer), %f если класс doble
        sc.close();
    }

}