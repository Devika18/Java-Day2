import java.util.Scanner;

//Declaring the class with name Natural Number
public class NaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        //Creating an object with name sc and giving input from command line

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i =1;

        //Storing command line input to the variable N
        int N = sc.nextInt();

        //Checking the condition in while loop
        while(i <= N) {
            sum = sum + i;
            i++;
        }
            System.out.println("Sum of Natural Number is: " + sum);
    }
}
