package Project;
//7. Write a Java Program to print the first 10 numbers of Fibonacci series.

public class Task7 {
    public static void main(String[] args) {
        int Numbers = 10;
        int FirstNumber = 0;
        int SecondNumber = 1;
        int NextNumber;

        for (int i = 0; i <Numbers ; i++) {

            System.out.print(FirstNumber+" ");

            NextNumber=FirstNumber+SecondNumber;
            FirstNumber=SecondNumber;
            SecondNumber=NextNumber;




        }
    }
}
