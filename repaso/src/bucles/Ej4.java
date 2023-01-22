package bucles;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your age: ");
		num=1;
		num2=keyboard.nextInt();
		while (num<=num2){
			System.out.println(num);
			num++;
		}
	}

}
