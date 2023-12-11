package alex;
import java.lang.Math;
import java.util.*;
public class exo4 {
static double number_User = 0;
static double result = 0;

	public static void main(String[] args) {
		System.out.print("Entrez le rayon du cercle");
		Scanner enter_User = new Scanner(System.in);
		number_User = enter_User.nextDouble();
		result = number_User * Math.PI * 2 ; 
		System.out.print(result);
		
		

	}

}
