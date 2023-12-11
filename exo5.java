package alex;
import java.util.*;

public class exo5 {
static int user_result = 0 ;
	public static void main(String[] args) {
		System.out.print("Entrez votre age");
		Scanner age = new Scanner(System.in);
		 user_result= age.nextInt();
		 if (user_result<18) {
			 System.out.print("Vous êtes mineur"); 
		 }
		 else System.out.print("Vous etes majeur");
		

	}

}
