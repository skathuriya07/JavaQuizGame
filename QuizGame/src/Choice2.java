import java.util.Scanner;

public class Choice2 {

    private static int i, ans, score;

    public static void playing() {
        System.out.println("========================================================================================================");
        System.out.println("\t\t\tWelcome to the game");
        System.out.println("========================================================================================================");
        for (i = 1; i <= 5; i++) {
            System.out.println("========================================================================================================");
            System.out.println("Question " + i + ":");
            System.out.println("========================================================================================================");

            questioning();
        }
        System.out.println("\n\n\n\n\n\nYou have reached the end of the game");
        System.out.println("Your total score is: "+ score);
        System.out.println("Thank you for playing");
    }
    public static void questioning() {
        //question 1
        if (i == 1) {
            System.out.println("\n\t\tWhich of the following statements are true for inheritance in java?\n");
            System.out.println("\t\t1:\"extend\" keyword is used to extend a class in java \t\t2:You can extend multiple classes in java.\n");
            System.out.println("\t\t3:Private members of superclass are accessible to subclass. \t\t4:We can’t extend Final classes in java.");
            scanning();
            if (ans == 4) {
                // 4 is correct answer
                System.out.println("\t\t\t\t\t\t\tCorrect Answer!!  :D");
                score += 10;
            } else {
                wrongAnswer();
            }
        }
        //question 2
        if (i == 2) {
            System.out.println("\n\t\tWhich of the following is correct syntax for java main class?\n");
            System.out.println("\t\t1: public void main(String[] args) \t\t2: public static void main(String[] args)\n");
            System.out.println("\t\t3:public static void main() \t\t4: public void main()\n");
            //scanning answer
            scanning();
            if (ans == 2) {
                // 2 is correct answer
                System.out.println("\t\t\t\t\t\t\tCorrect Answer!!  :D");
                score += 10;
            } else {
                wrongAnswer();
            }
        }
        //question 3
        if (i == 3) {
            System.out.println("\n\t\tWhich of the following is not a Java keyword?\n");
            System.out.println("\t\t1: new \t\t2: try\n");
            System.out.println("\t\t3: Integer \t\t4:static\n");
            scanning();
            if (ans == 3) {
                // 3 is correct answer
                System.out.println("\t\t\t\t\t\t\tCorrect Answer!!  :D");
                score += 10;
            } else {
                wrongAnswer();
            }
        }
        //question 4
        if (i == 4) {
            System.out.println("\n\t\tWhat is an assignment statement?\n");
            System.out.println("\t\t1:adding a number to int \t\t2: assigning a multiplication\n");
            System.out.println("\t\t3:assigning name to variable \t\t4: assigning value to variable\n");
            scanning();
            if (ans == 4) {
                // 4 is correct answer
                System.out.println("\t\t\t\t\t\t\tCorrect Answer!!  :D");
                score += 10;
            } else {
                wrongAnswer();
            }
        }
        //question 5
        if (i == 5) {
            System.out.println("\n\t\tAn object could be:\n");
            System.out.println("\t\t1:anything \t\t2:an algorithm\n");
            System.out.println("\t\t3:a data container \t\t4:a program\n");
            scanning();
            if (ans == 1) {
                // 1 is correct answer
                System.out.println("\t\t\t\t\t\t\tCorrect Answer!!  :D");
                score += 10;
            } else {
                wrongAnswer();
            }
        }
    }
    public static int scanning()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your answer: ");
        ans = scan.nextInt();
        return ans;
    }
    public static void wrongAnswer()
    {
        System.out.println("\t\t\t\t\t\t\tWrong Answer :(");
        System.out.println("\t\t\t\tMoving on to next question");
    }
}

