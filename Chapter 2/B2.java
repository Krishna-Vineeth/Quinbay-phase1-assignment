class Episode {
    int seriesNumber;
    int episodeNumber;
    
    void play() {
        System.out.println("Playing episode " + episodeNumber);
    }
    
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
public class B2 {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play(); // To call the play function it should be declared in its respective class
        episode.skipIntro();
    } 
}