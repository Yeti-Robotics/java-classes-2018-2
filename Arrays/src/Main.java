import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        System.out.println(Arrays.toString(array));
        
        System.out.println(array[0]);
        
        array[0] = 8;
        
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
