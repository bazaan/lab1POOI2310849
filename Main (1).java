import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        scanner.close();
        
        if (num > 0 && num % 2 != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	
	}
}