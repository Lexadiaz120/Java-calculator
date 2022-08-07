import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce your first number");
    int num1 = scanner.nextInt();
    System.out.println("Introduce your first number");
    int num2 = scanner.nextInt();
    System.out.println("Action");
    int res;
    String action = scanner.nextLine();
    action = scanner.nextLine();
    switch(action) {
        case "+":
            res = num1 + num2;
            System.out.println("Result" + res);
            break;
        case "-":
            res = num1 - num2;
            System.out.println("Result" + res);
            break;
        case "*":
            res = num1 * num2;
            System.out.println("Result" + res);
            break;
        case "/":
            if(num2 == 0)
                System.out.print("Error");
            else {
                res = num1 / num2;
                System.out.println("Result" + res);
            }
            break;
        default:
            System.out.println("You introduced something bad");
    }
    }
}
