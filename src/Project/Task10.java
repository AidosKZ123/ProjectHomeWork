package Project;
//Write a program to print out duplicate elements from an Array of Strings?
public class Task10 {
    public static void main(String[] args) {

        int[] numbers = {10, 7, 17, 26,26, 16, 28, 7, 30, 21};

        for (int i = 0; i < numbers.length; i++) {
            for (int j =i+1; j <numbers.length ; j++) {
                if (numbers[i] == numbers[j])
                    System.out.println("The duplicate number is "+numbers[j]);

            }

        }
    }
}

