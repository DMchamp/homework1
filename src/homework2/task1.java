package homework2;

public class task1 {
    public static void main(String[] args) {

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String hiTrim = hi.trim();
        String worldLower = world.toLowerCase();
        String allWord = hiTrim+worldLower+newLine;

        System.out.print(allWord.repeat(3));

    }
}
