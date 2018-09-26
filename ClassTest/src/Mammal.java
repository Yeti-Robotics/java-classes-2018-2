
public class Mammal {
    private int numLegs;
    private static String mammaryGland;
    
    public Mammal(int numLegs) {
        this.numLegs = numLegs;
    }
    
    public Mammal() {
        
    }
    
    public void speak() {
        System.out.println("I am a mammal.");
    }
    
    public void setMammaryGland(String gland) {
        mammaryGland = gland;
    }
    
    public String getMammaryGland() {
        return mammaryGland;
    }
    
    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
}
