package Work1;

import java.util.Scanner;

public class Work1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Базовый уровень
         //Задача №1
        {
            String hi = "                Hello ";
            String world = " WoRld!";
            char newLine = '\n';

            String nHi = hi.trim();
            String lWord = world.toLowerCase();
            String nWord = nHi + lWord + newLine;

            System.out.print(nWord.repeat(3));
        }

        //Задача №2
        {
            System.out.println("\nВведите рост в метрах. Через запятую");
            float growth = scanner.nextFloat();

            System.out.println("Введите вес");
            float weight = scanner.nextFloat();

            float bodyMassIndex = weight / (growth * growth);
            System.out.println("Индекса массы тела " + bodyMassIndex);
        }

        //Задача №3
        {
            char[] chr = {'a', 'b', 'c', 'd', 'e'};

            String str1 = String.valueOf(chr);
            System.out.println(str1);

            chr[3] = 'h';

            String str2 = String.valueOf(chr);
            System.out.println(str2);
        }

        //Задача №4
        {
            for (int i = 1; i <= 100 ; i++) {
                System.out.print(i + "a ");

                if(i%10 == 0)
                    System.out.println();
            }
        }

        //Задача №5
        {
            System.out.println("Введите возраст ребёнка: ");
            int age = scanner.nextInt();

            if (age <= 6)
                System.out.println("Ребёнок идёт в сад");

            else if (age <= 11)
                System.out.println("Идёт в младшую школу");

            else if (age <= 17)
                System.out.println("Идёт в среднюю школу");

            else
                System.out.println("Идёт в институт");
        }
    }
}
