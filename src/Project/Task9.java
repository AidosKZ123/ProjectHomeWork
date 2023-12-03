package Project;
//Write a java program to find the second largest number in the array?
public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {10, 7, 17, 26, 16, 28, 30, 21};

        int SecondLargestNumber = numbers[0];


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length; j++) {


                if (numbers[i] < numbers[j]) {
                    SecondLargestNumber = numbers[i];
                    numbers[i] = numbers[j];
                }


            }
        }System.out.println("Second largest number is " + SecondLargestNumber);
    }
}
