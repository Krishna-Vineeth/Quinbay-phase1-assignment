class StreamingSong {
    
    String title;
    String artist;
    
    void play() {
        System.out.println("Playing song");
    }
    
    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}

public class A2 {
    public static void main(String[] args) {
    
        StreamingSong song = new StreamingSong(); // We must create a object of the respective class before using the variables and methods.
        
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
