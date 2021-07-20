import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        String yn;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number");
            int first = input.nextInt();

            System.out.println("Enter the second number");
            int second = input.nextInt();

            System.out.println("Enter the operator");
            String opt = input.next();



            switch (opt) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    System.out.println(first / second);
                    break;
                default :
                    System.out.println("Invalid Operator");
            }
            System.out.println("Do you want more? Type 'Y' for Yes and 'N' for no.");
            yn = input.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}
