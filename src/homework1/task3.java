package homework1;

public class task3 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = false;
        boolean eggs = true;

        boolean caesarSalad = chicken && sour && eggs && toast;
        boolean olivierSalad = vegetables && eggs && (chicken || sausage);
        boolean vegetablesSalad = vegetables;

        if (caesarSalad){
            System.out.println("Можно приготовить салат цезарь");
        } else if (olivierSalad){
            System.out.println("Можно приготовить салат оливье");
        } else if (vegetablesSalad){
            System.out.println("Можно приготовить овощной салат");
        } else {
            System.out.println("Готовить нечего");
        }
    }
}
