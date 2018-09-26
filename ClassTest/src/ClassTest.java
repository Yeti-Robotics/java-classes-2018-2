
public class ClassTest {
    
    public static void main(String[] args) {
        Mammal mammal1 = new Mammal(4);
        mammal1.speak();
        
        Cat cat = new Cat();
        cat.meow();
        cat.speak();
        int[] array = {1, 2, 3};
        System.out.println(array[0]);
//        for (int i = 0; i < 10; i++) {
//            cat.meow();
//        }
        cat.setNumLegs(4);
        System.out.println(cat.getNumLegs());
        mammal1.setNumLegs(3);
        System.out.println();
        System.out.println(mammal1.getMammaryGland());
    }
}
