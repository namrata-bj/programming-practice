import java.util.Scanner;

class ModNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int mod = a % b;
        System.out.println("Mod = " + mod);
    }
}
