class A {
    public static void main(String [] args) {
        
        int x = 1;
        while ( x < 10 ) {
            // In this question there is no increment of 'x' in the while loop. Adding this line makes the code execute successfully.
            x = x + 1; 
            
            if ( x > 3) {
                System.out.println("big x");
            }
        }
    }
}