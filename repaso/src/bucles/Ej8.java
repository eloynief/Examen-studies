package bucles;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,negativo=0,positivos=0;
		Scanner keyboard = new Scanner(System.in);
		
		while (num!=0){
			System.out.println("pon numero: ");
			num=keyboard.nextInt();
			if(num<0) {
				//aumenta la cantidad de numeros negativos
				negativo++;
			}
			else if (num>0){
				positivos++;
			}
		}
		//como el otro contador de negativos no se reduce, entonces si hay negativos este cintador es mayor que 0
		
			System.out.println("hay " + negativo + " numeros negativos y " + positivos + " numeros positivos");
		
	}

}
