package Work1;

public class Work1Plus {
    public static void main(String[] args) {
        //№1
        {
            String strNumber = "234";
            String text = "some_text";

            int numb = Integer.parseInt(strNumber);
            int nText = text.length();

            System.out.println("Результат сложения: " + (numb + nText));
        }
        //2
        {
            int a = 3;
            int b = 5;

            int c = (a + b)^2; // ^ - знак не понятен

            System.out.println("Результат: " + c);
        }
    }
}
