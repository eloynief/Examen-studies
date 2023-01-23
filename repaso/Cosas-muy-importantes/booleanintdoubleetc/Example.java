package booleanintdoubleetc;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false
		
		//if+else
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		//sin if else pero es lo mismo (ternarios)
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		
		//switch+case
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		// Outputs "Thursday" (day 4)
		
		
		//while
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		//for
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		
		
		//el break rompe el bucle
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		//el continue rompe una iteracion del loop y continua con la siguiente
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		
		
		
		
		//se ejecuta lo que tenga el metodo myMethod
		myMethod("nombre", 2); //si lo pones varias veces, se ejecuta varias veces
	}
	//crear metodos en java
	 static void myMethod(String fname,int age) {
		    System.out.println("I just got executed!");
		    System.out.println(fname + " Refsnes");
		  }
}
