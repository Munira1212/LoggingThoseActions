public class Main {


void run() {
    Menu menu = new Menu("MENU:", "Please choose option: ", new String[]{
            "1. To add a line to log",
            "2. To view list",
            "3. Delete from the list",
            "9. Quit"});


    menu.printMenu();
    menu.readChoice();

}

    public static void main(String[] args) {
        new Main().run();
    }


}
