package carpeta;

public class B{
	//llama a la clase wat
	//la a es un objeto de wat
	   private Wat a;

	   public B(Wat a){
	       this.a = a;

	       a.saludar(); // podemos llamar este metodo por que es public
	       System.out.println("Me llamo "+a.nombre);// igualmente podemos acceder a este atributo por que es public
	   }
}
