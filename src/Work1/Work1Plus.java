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
    }
}
