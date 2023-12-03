package Project;
//8. Maximum and minimum number in the array?

public class Task8 {
    public static void main(String[] args) {

        int [] numbers = {10,7,17,26,16,28,30,21};

        int MaxNumber = numbers[0];
        int MinNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

              if (numbers[i]>MaxNumber){
                  MaxNumber=numbers[i];
              }else if (numbers[i]<MinNumber){
                  MinNumber=numbers[i];
              }




    }   System.out.println("Maximum number is " + MaxNumber);
        System.out.println("Maximum number is " + MinNumber);
}
}
