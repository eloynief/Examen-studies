package funciones;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2;
		int comparacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		num= sc.nextInt();
		System.out.println("Introduce el número: ");
		num2= sc.nextInt();
		comparacion=minimo(num,num2);
	}
	int minimo(int a,int b) {
		int menor;
		if (a<b) {
		menor=a;
		}
		else {
		menor=b;
		}
		return menor;
	}
}
