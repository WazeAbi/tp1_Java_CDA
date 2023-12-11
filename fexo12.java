package alex;
import java.util.*;
public class fexo12 {
static int a , b , c = 0 ; 
	public static void main(String[] args) {
		a = 10; 
		b = 12;
		System.out.print("la valeur de a est " +a+ " et la valeur de b est " + b + "\n");
		c=a ;
		a =b;
		b= c; 
		System.out.print("la valeur de a est " + a + " et la valeur de b est " + b );
	}

}
