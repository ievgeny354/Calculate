import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calcMenu();

    }

    private static void calcMenu() {
        int butt=5;
        Scanner button = new Scanner(System.in);
        while (butt != 0) {
            System.out.println("Выберите пункт меню:");
            System.out.println("1.Сложить");
            System.out.println("2.Вычесть");
            System.out.println("3.Умножить");
            System.out.println("4.Разделить");
            System.out.println("0.Выход");
            butt = button.nextInt();
            userMistake(butt);
        }
    }

    private static void userMistake(int butt) {
        if ((butt < 0) || (butt > 4)) {
            System.out.println("____________");
            System.out.println("Пользователь ввел некорректное: " + butt);
            System.out.println("Введите правильное значение");
            System.out.println("____________");
        }
    }
}