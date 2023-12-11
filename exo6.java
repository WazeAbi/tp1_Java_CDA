package alex;
import java.util.*;
public class exo6 {
static int user_Enter = 0 ;

	public static void main(String[] args) {
		System.out.print("Entrez un nombre ");
		Scanner number = new Scanner(System.in);
		user_Enter =number.nextInt();
		if (user_Enter%2 == 0) {
			System.out.print("Le Nombre est paire");
		}
		else System.out.print("Le Nombre est impaire");
		
		// TODO Auto-generated method stub

	}

}
