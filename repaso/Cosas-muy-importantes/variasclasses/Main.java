package variasclasses;

public class Main {
	//valor del int
	int x = 5;
	//los int saldrán posiblemente en otro color
	int a=0;
	  public static void main(String[] args) {
		//objetos del mismo main
	    Main myObj1 = new Main();  // Object 1
	    //el main hace referencia a su mismo archivo
	  //class nombreobjeto=new class(); 
	    Main myObj2 = new Main();  // Object 2
	    //hace print del x del main
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	  }

}
