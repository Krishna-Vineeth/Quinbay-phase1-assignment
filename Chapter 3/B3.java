public class B3 {
    String name;
    public static void main(String[] args) {
        B3[] h = new B3[3];
        int z = -1;
        
        while (z < 2) {
            z = z + 1;
            h[z] = new B3();
            h[z].name = "bilbo";
        
            if (z == 1) {
                h[z].name = "frodo";
            }
        
            if (z == 2) {
                h[z].name = "sam";
            }
            
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}