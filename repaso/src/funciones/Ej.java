package funciones;

import java.util.Scanner;

public class Ej {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		double num,num2;
		double resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		num= sc.nextInt();
		System.out.println("Introduce el número: ");
		num2= sc.nextInt();
		
		//        static double
		//num y num2 son los valores de double que van a tener a y de b
		resultado=multiplica(num,num2);
		System.out.println(resultado);
	}
	//el double multiplica lo utilizamos para hacer las operaciones y luego dar el resultado
	static double multiplica(double a,double b) {
		double multiplicacion;
		multiplicacion=a*b;
		return multiplicacion;
	}
}
