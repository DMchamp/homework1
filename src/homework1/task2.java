package homework1;

public class task2 {
    public static void main(String[] args) {
        int ageChildren = 12;

        if (ageChildren < 6){
            System.out.println("Пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в начальную школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в старшую школу");
        } else {
            System.out.println("Пошел в унивирситет");
        }
    }
}
