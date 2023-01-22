package comandostema4;

import java.util.Scanner;

public class ObjetoYStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int res;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		res=nombre(num); //no hay static en nombre
	}
	int nombre(int a) {
		int valor=0;
		return valor;
	}
}
