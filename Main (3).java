import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un número: ");
        int numA = scanner.nextInt();
        
        System.out.print("Ingresar un número: ");
        int numB = scanner.nextInt();

        scanner.close();
        
        if ((numA > 0 && numB > 0) || (numA < 0 && numB < 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	
	}
}