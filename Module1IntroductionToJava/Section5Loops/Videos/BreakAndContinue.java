package Module1IntroductionToJava.Section5Loops.Videos;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
