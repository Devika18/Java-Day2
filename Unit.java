import java.util.Scanner;

public class Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, hundreds, ones, tens, thousands;
        System.out.println("Enter the number: ");
    number = ((Scanner) sc).nextInt();
        ones=number%10;
        tens=number%100-ones;
        hundreds=number%1000-tens-ones;
        thousands=(number%10000-hundreds-tens-ones)/1000;
        hundreds=hundreds/100;
        tens=tens/10;
        System.out.println("Hundred: "+ hundreds);
        System.out.println("Unit: "+ ones);
        System.out.println("Ten: "+ tens);
        System.out.println("Thousand: "+ thousands);

    }
}
