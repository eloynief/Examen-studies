package carpetatest;

public class SimpleTesting{
    public static void main(String[] args) {
        Test t = new Test();
        t.add(10, 20);
        int result = Test.sum; // accessing variable
        System.out.println("sum = "+result);
    }
}
//otra clase
class Test{
    static int sum;
    void add(int a, int b) {
        sum = a+b;
    }

}
