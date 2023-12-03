package Project;

// Create a 2D array or integer type where you will store odd and even
//numbers. Develop a program which will identify/print the even numbers
//only.

public class Task3 {
    public static void main(String[] args) {

        int [] [] numbers =  {

                            {20,30,40,50,60,70,80,90},
                            {11,21,31,41,51,61,71,81,91},
                            {11,12,41,54,61,76,86,91},
                            {11,27,31,42,61,75,87,89}
};

        int EvenNumbers=0;
        int OddNumbers=0;



        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i][j]%2==0){
                    EvenNumbers=numbers[i][j];


                }System.out.print(EvenNumbers+" ");



            }

        }




}
}