import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("\nEnter b: ");
        b = input.nextInt();
        System.out.print("\nEnter c: ");
        c = input.nextInt();

        System.out.printf("Quadratic Equation is %dx^2 + %dy + %d = 0",a,b,c);

        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        if(equation.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots: 1: %d \n 2: %d",equation.getRoot1(),equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.printf("The equation has 1 roots: ", equation.getRoot1());
        } else System.out.println("\nThe equation has no roots");

    }
}