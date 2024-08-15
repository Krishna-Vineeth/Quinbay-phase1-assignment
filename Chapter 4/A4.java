public class A4 {
    public static void main(String[] args) {
        int orig = 42;
        A4 x = new A4();
        int y = x.go(orig);
        
        System.out.println(orig + " " + y);
    }
        
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}