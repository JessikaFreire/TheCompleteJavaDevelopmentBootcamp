package Module1IntroductionToJava.Section6Arrays.Workbook02;

public class Exams {
    public static void main(String[] args) {
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        // Task 1: Create an array that stores 5 students: "Malfoy", "Crabbe", "Goyle",
        // "Pansy", "Dean"

        String seats[] = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        /**
         * Task 2: Using a for loop, assign each student a seat according to their index
         * in the array.
         * 
         * for ( ...) {
         * <student at index i>, you will take seat i
         * }
         * 
         */
        //

        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + " you will take seat " + i);
        }
    }
}
