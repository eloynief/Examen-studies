package bucles;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,num2=0,negativo=0, subnegativa=0,contador=0;
		Scanner keyboard = new Scanner(System.in);
		
		while (num2<10){
			System.out.println("pon numero: ");
			num=keyboard.nextInt();
			if(num<0) {
				//aumenta la cantidad de numeros negativos
				negativo++;
				//tambien su otro contador
				subnegativa++;
			}
			//aumenta la variable que hace del while
			num2++;
		}
		//mientras haya numeros negativos
		while(negativo>0){
			//aumenta el numero de numeros negativos
			contador++;
			//se resta negativo por cada negativo que introduce al contador
			negativo--;
		}
		//como el otro contador de negativos no se reduce, entonces si hay negativos este cintador es mayor que 0
		if(subnegativa>0) {
			System.out.println("hay " + contador + " numeros negativos");
		}
	}

}
