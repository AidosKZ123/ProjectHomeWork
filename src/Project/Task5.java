package Project;


//5. Write a program to swap 2 numbers without a temporary variable?
public class Task5 {
    public static void main(String[] args) {

        int a = 100;
        int b = 500;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
