class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    
    String getTime() {
        return time;
    }
}
public class B4 {
    public static void main(String[] args) {
        
        Clock c = new Clock();

        c.setTime("1245");

        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}