package alex;
import java.util.*;
import java.util.Date;
public class exo8 {
static int choix = 0;
	public static void main(String[] args) {
		System.out.print("Entrez le mois en chiffre");
		Scanner Mois = new Scanner(System.in);
		choix=Mois.nextInt();
		if ((choix> 12) || (choix <1)) { 
			System.out.print("Entrez une valeur comprise entre 1 et 12");
			choix=Mois.nextInt();
		}
	

	switch(choix) {
	case 1:
		System.out.print("Janvier 31 jours");
	break;
	case 2 :
		System.out.print("Février 28 ou 29 jours");
	 break;
	case 3:
		System.out.print("Mars 31 jours ");
	break;
	case 4 :
		System.out.print("Avril 30 jours");
	 break;
	case 5:
		System.out.print("Mai 31 jorus");
	break;
	case 6 :
		System.out.print("Juin 30 jours");
	 break;
	case 7:
		System.out.print("Juillet 31 jours");
	break;
	case 8 :
		System.out.print("Aôut 31 jours");
	 break;
	case 9:
		System.out.print("Septembre 30 jours");
	break;
	case 10 :
		System.out.print("Octobre 31 jours");
	 break;
	case 11:
		System.out.print("Novembre 30 jours");
	break;
	case 12 :
		System.out.print("Décembre 31 jours");
	 break;
	}

	}

}
