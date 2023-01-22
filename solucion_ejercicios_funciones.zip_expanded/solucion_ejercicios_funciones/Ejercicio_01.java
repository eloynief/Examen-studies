
import java.util.Scanner;

public class Ejercicio_01 {
	//esta variable hace las operaciones
    public static double multiplica(double a, double b) {
        return a * b;
    }
    //esto guarda los valores que se van a usar
    public static void main(String[] args) {
        double x, y, res;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número real: ");
        x = entrada.nextDouble();
        System.out.print("Introduce un número real: ");
        y = entrada.nextDouble();
        
        //"multiplica" es lo que se ha hecho antes en el static double
        res = multiplica(x, y);
        //el "res" es una variable hecha para que lo que de en la otra variable se pueda usar como cualquier otra variable
        System.out.println("Resultado: " + res);
    }

}
