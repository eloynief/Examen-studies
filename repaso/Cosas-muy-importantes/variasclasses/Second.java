package variasclasses;

public class Second {

	public static void main(String[] args) {
		//este objeto creado hace referencia al main de su propio paquete
	    Main myObj = new Main();
	   // hace print del int x del main sacandolo del myObj
	    System.out.println(myObj.x);
	  }

}
