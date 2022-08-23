package Work1;

public class Work1 {
    public static void main(String[] args) {
        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String nHi = hi.trim();
        String lWord = world.toLowerCase();
        String nWord = nHi + lWord + newLine;

        System.out.print(nWord.repeat(3));
    }
}
