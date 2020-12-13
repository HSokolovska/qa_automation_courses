import java.util.Scanner;

public class LogicalConstructions {
    public static void main(String[] args) {

        int a = 1, b = 2;

        if (a < b) {
            System.out.println("a < b");
        }


        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a не меньше b");
        }

        int c = 1, d = 2, max = 0;

        max = (c > d) ? c : d;

        System.out.println(max);

        int e = 2;
        int f = 1;
        if (e < f || e >= f)  {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


        if (e > f && f < e) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


        int myDay;
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");

        Scanner in = new Scanner(System.in);
        myDay = in.nextInt();

        switch (myDay) {
            case 1:
                System.out.println("Понедельник.");
                break;
            case 2:
                System.out.println("Вторник.");
                break;
            case 3:
                System.out.println("Среда.");
                break;
            case 4:
                System.out.println("Четверг.");
                break;
            case 5:
                System.out.println("Пятница.");
                break;
            case 6:
                System.out.println("Суббота.");
                break;
            case 7:
                System.out.println("Воскресенье.");
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;

                //Special string for creating pull request
        }

    }
}
