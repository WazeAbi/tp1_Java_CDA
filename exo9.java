
package alex;
import java.util.*;
public class exo9 {
	static void years(int year) {
	System.out.print("Entrez l'année souhaité");
	Scanner enter_User = new Scanner(System.in);
	year = enter_User.nextInt();
	if((year%4 != 0 )||((year%100==0)&& (year%400!=0))){ 
		System.out.print("L'année est n'est pas bixestile");
		
	}
	else System.out.print("L'année bixestile");

}
	public static void main(String[] args) {
	years(0);

	}

}
