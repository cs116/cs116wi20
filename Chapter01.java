import java.util.Scanner;

public class Chapter01 {

    public static void main(String args[]) {
        //printHelloWorld();
        printDollarsPerMile();
    }

    public static void printHelloWorld() {
        System.out.println("Hello, world");
    }

    public static void printDollarsPerMile() {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter miles per gallon:");
        double mpg = keyboardInput.nextDouble();

        System.out.println("Enter dollars per gallon:");
        double dpg = keyboardInput.nextDouble();

        // dollars per mile equals dollars per gallon divided by miles per gallon
        System.out.printf("If your gas costs $%4.2f dollars per gallon,%n" , dpg);
        System.out.printf("and your car gets %3.1f miles per gallon,%n" , mpg);
        System.out.printf("Then your gas costs $%4.2f dollars per mile ", (dpg / mpg) );
        System.out.printf("(%4.2f cents per mile).%n", (100 * dpg / mpg) );
    }

}
