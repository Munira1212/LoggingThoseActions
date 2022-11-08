import java.io.PrintStream;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

        private String menuHeader;
        private String leadText;

        private String menuItems[];
        private boolean keepRunning;
    //private final String logfil = "src/logfil";
   // PrintStream ps = null;


        public Menu(String menuHeader, String leadText, String menuItems[]) {
            this.menuHeader = menuHeader;
            this.leadText = leadText;
            this.menuItems = menuItems;
        }
        public void printMenu() {
            System.out.println("MENU:");
            System.out.println("The options");
            System.out.println(Arrays.toString(new String[]{"1. To add a line to log 2. To view list 3. Delete from the list 9. Quit"}));
        }


    LoggingThoseActions LTA= new LoggingThoseActions(LocalTime.now());

    public void readChoice() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {

            case 1:
                LTA.addline();

                break;
            case 2:
                LTA.viewUserList();

                break;
            case 3:
                System.out.println("Delete line");
                LTA.delete();
                break;

            case 9:
                System.out.println("9: Exit Program");
                keepRunning = true;
                break;
        }
         printMenu();
        readChoice();
    }


    }
