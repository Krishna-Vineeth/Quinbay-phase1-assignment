public class MultipleException {
    public static void main(String[] args) {
        try {
            
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing an element outside the array bounds:");
            System.out.println(numbers[1]);

            int division = 10 / 1;
            System.out.println("Result of division by zero: " + division);

            String text = null;
            System.out.println("Length of the string: " + text.length());

            String number = "abc";
            int parsedNumber = Integer.parseInt(number);
            System.out.println("Parsed number: " + parsedNumber);

        } 
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        
        catch (NullPointerException e) 
        {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } 
        
        catch (NumberFormatException e) 
        {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } 
        
        catch (Exception e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program is working fine!");
    }
}
