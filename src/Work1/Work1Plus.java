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

        //3
        {
            int [] oneArray = {1,2,5,7,10};
            int [] twoArray = {2,3,2,17,15};
            int [] threeArray = new int[5];

            int [] newArray = new int [oneArray.length + twoArray.length + twoArray.length];
            for (int i = 0; i < threeArray.length; i++) {
                threeArray[i] = oneArray[i]*twoArray[i];
            }
            int arLength = oneArray.length + twoArray.length;

            System.arraycopy(oneArray, 0, newArray, 0, oneArray.length); // Гугл был в помощь
            System.arraycopy(twoArray, 0, newArray, oneArray.length, twoArray.length);
            System.arraycopy(threeArray, 0, newArray, arLength, threeArray.length );

            for (int i = 0; i < newArray.length; i++)
                System.out.print(newArray[i] + " ");
            System.out.println();
        }

        //4
        {
            String strg = "Hello world!";
            String strg2 = strg.replace("l","r");
            String strg3 = strg2.toUpperCase();
            String strLost = strg3.substring(0,8);

            System.out.println(strLost);
        }

        //5
        {
            double increment = 0.01123;
            double result = 0;
            int end = 1000000;
            int count = 0;

            for (; result < end;) {
                if (result < 0)
                    break;;
                    result += increment;
                    count++;
            }
            System.out.println("Количество итераций до миллиона " + count);
        }
    }
}
