package Project;
// Create an array of integer values. After the array is created, calculate the
//sum of all stored elements in that array
public class Task2 {
    public static void main(String[] args) {

        int [] numbers = {55,66,77,88,99,44,11,22,33,};

        int sum =0;

        for (int i = 0; i < numbers.length; i++) {
             sum+=numbers[i];
        }
        System.out.print("Summary of all elements is "+sum);




        }

    }

