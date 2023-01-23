package bucles;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, num2 = 0, dieces = 0;
		Scanner sc = new Scanner(System.in);
		
		while (num >= -1) {
			System.out.println("Introduce la nota");
			num = sc.nextInt();
			if (num == 10) {
				dieces++;
			}
			else if (num==-1) {
				break;
			}
		}
		if(dieces>1) {
		System.out.println("Hay "+dieces+" dieces");
		}
		else if(dieces==1) {
			System.out.println("Hay "+dieces+" solo diez");
			}
		else {
			System.out.println("No hay dieces");
		}
	}

}
