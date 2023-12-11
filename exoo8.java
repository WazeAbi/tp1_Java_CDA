package alex;
import java.util.*;
import java.util.Date;
public class exoo8 {
static String choix ;
	public static void main(String[] args) {
		System.out.print("Entrez le mois en lettre");
		Scanner Mois = new Scanner(System.in);
		choix = Mois.next();
		
	

	switch(choix) {
	case "Janvier":
		System.out.print("Janvier 31 jours");
	break;
	case "Février":
		System.out.print("28 ou 29 jours");
		break;
	case ("Mars"):
		System.out.print("31 jours ");
	break;
	case "Avril" :
		System.out.print(" 30 jours");
	 break;
	case "Mai":
		System.out.print(" 31 jorus");
	break;
	case "Juin" :
		System.out.print(" 30 jours");
	 break;
	case "Juillet":
		System.out.print(" 31 jours");
	break;
	case "Août" :
		System.out.print(" 31 jours");
	 break;
	case "Septembre":
		System.out.print("30 jours");
	break;
	case "Octobre" :
		System.out.print("31 jours");
	 break;
	case "Novembre":
		System.out.print("30 jours");
	break;
	case "Décembre" :
		System.out.print("31 jours");
	 break;
	}

	}

}