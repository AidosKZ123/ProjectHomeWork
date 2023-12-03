package Project;


//. Create a 2D array of integers. Develop a program which will calculate the
//sum of even and odd numbers for that array.

public class Task4 {
    public static void main(String[] args) {

        int [][] numbers = {

                {10,20,30},
                {20,10,5},
                {20,10,5}
        };
        int sum =0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                sum +=numbers[i][j];

            }

        } System.out.print(sum);






    }
    }
