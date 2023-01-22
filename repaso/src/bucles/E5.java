package bucles;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		
		//i need help
		
		// TODO Auto-generated method stub
		int num,num2,num3,num4,num5;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("put a number: ");
		num=1;
		num2=keyboard.nextInt();
		num4=num2;
		while (num<=num4){
			num3=num4-num;
			num5=num2*num3;
			System.out.println(num5);
			num++;
		}
	}

}
