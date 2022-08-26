package Module1IntroductionToJava.Section3BooleansAndConditionals.Workbook5;

public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;
        boolean holiday = true;

        if (holiday) {
            // if it's a holiday, print: "woohoo, no work!");
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            // if it's the weekend, print: "it's the weekend, no work!"
            System.out.println("it's the weekend, no work!");
        } else {
            // otherwise, print: "Wake up at 7:00 :( ";
            System.out.println("Wake up at 7:00 :(");
        }
    }
}
