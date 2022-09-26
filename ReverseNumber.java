import java.util.Scanner;

//Declaring the class with name Reverse Number
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number which need to be reversed: ");

        //Creating an object with name num and taking input from command line
        Scanner num = new Scanner(System.in);

        //Storing command line input into the integer i
        int i = num.nextInt();
        int reverse=0;
        while(i != 0)
        {

            /** i = 1234
             * rem = 1234 % 10 = 4
             * reverse = 0 * 10 + 4 = 4
             * i = 1234/10 = 123
             */
            
            int rem = i%10;
            reverse = reverse*10 + rem;
            i = i/10;
        }
        System.out.println("Sum of Natural Number is: " + reverse);
    }
}
