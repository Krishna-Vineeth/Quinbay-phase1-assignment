class DrumKitTest {
    boolean topHat = true;
    boolean snare = true;
    
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
    
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}
public class DrumKit {
    public static void main(String[] args) {
    
        DrumKitTest d = new DrumKitTest();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
    
        if (d.snare == true) {
            d.playSnare();
        }
    }
}