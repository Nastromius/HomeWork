package Work1;

import java.util.Scanner;

public class Work1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //������ �1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String nHi = hi.trim();
        String lWord = world.toLowerCase();
        String nWord = nHi + lWord + newLine;

        System.out.print(nWord.repeat(3));

        //������ �2

        System.out.println("\n������� ���� � ������. ����� �������");
        float growth = scanner.nextFloat();

        System.out.println("������� ���");
        float weight = scanner.nextFloat();

        float bodyMassIndex = weight/(growth * growth);
        System.out.println("������� ����� ���� " + bodyMassIndex);
    }
}
