import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int test = 100;
		
		Scanner scan = new Scanner(System.in);
		
		
		try {			
			scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Masukan angka");
		}
		
		System.out.println("Ini harus jalan " + test);
	}
}
