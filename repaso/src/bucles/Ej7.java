package bucles;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int num=0,num2=0,negativo=0,positivos=0;
		Scanner keyboard = new Scanner(System.in);
		
		while (num2<10){
			System.out.println("pon numero: ");
			num=keyboard.nextInt();
			if(num<0) {
				//aumenta la cantidad de numeros negativos
				negativo++;
			}
			else if (num>0){
				positivos++;
			}
			else {
				System.out.println("Error");
			}
			//aumenta la variable que hace del while
			num2++;
		}
		//como el otro contador de negativos no se reduce, entonces si hay negativos este cintador es mayor que 0
		
			System.out.println("hay " + negativo + " numeros negativos y " + positivos + " numeros positivos");
		
	}

}
