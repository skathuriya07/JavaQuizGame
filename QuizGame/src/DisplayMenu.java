import java.util.Scanner;

public class DisplayMenu extends Choice2 {

    public void menu() {
        System.out.println("\t\t\t\tWelcome to the quiz");
        System.out.println("\t\t\t\t\t1: How to play");
        System.out.println("\t\t\t\t\t2: Play game");
    }

    public void getChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\t\t\t\tPlease enter a choice to continue");
        menu();
        switch (scan.nextInt()) {
            case 1:
                Choice1.howToPlayMenu();
                getChoice();
                return;

            case 2:
                Choice2.playing();
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                menu();
        }
    }
}
