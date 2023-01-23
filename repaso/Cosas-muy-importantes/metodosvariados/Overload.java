package metodosvariados;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//el mynum1=12
			int myNum1 = plusMethodInt(8, 5);
			//mynum2=4.3+6.26
			double myNum2 = plusMethodDouble(4.3, 6.26);
			System.out.println("int: " + myNum1);
			System.out.println("double: " + myNum2);
	}
	static double plusMethodDouble(double x, double y) {
		  return x + y;
		}
	static int plusMethodInt(int x, int y) {
		  return x + y;
		}
}


/** create write files
 * 
 * import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
 */
