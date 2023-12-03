package Project;

// Create a program that uses an array to store a list of temperatures for a week,
//and then uses a loop to find the highest and lowest temperature for the week.

public class Task1 {
    public static void main(String[] args) {
        double[] temp = {11.2, 22.2, 33.4, 44.5, 55.5, 66.6, 77.7};

        double HighestTemp = temp[0];
        double LowestTemp = temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > HighestTemp) {
                HighestTemp=temp[i];
            } else if (temp[i]<LowestTemp) {
                LowestTemp=temp[i];

            }

        } System.out.println("The highest temperature of the week: " + HighestTemp);
        System.out.printf("The highest temperature of the week: "+LowestTemp);
    }
}
