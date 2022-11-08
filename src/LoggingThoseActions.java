import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class LoggingThoseActions {

    private String lineOutput;
    private LocalTime time;
    private int number;
    Scanner sc= new Scanner(System.in);
  private   ArrayList<String> lines= new ArrayList<>();
    PrintStream ps = null;
    private final String logfil = "src/logfil";

    public LoggingThoseActions(LocalTime time){
        this.time= LocalTime.now();
    }


    public void addline(){

        System.out.println("Add a line.");
        this.lineOutput = sc.nextLine();

        lines.add(lineOutput);
      // saveLogfil("Line added" + LocalTime.now());
    }

   public void viewUserList() {
        for (int i = 0; i < lines.size(); i++)
            System.out.println(lines.get(i));
      // saveLogfil("View" + LocalTime.now());
    }

    public void delete(){

        System.out.println("Tast the number you wish to delete");
        number = sc.nextInt();
        int outPutminus1 = number - 1;
        System.out.println(lines.remove(outPutminus1));

        ps.println(" Time " +  LocalTime.now() + " Action: Delete" );
        ps.close();
    }

    void saveLogfil(String msg, LocalTime time) {

        try {
            ps = new PrintStream(logfil);
            for (int i = 0; i < lines.size() ; i++) {
            ps.append("Line: "+ lines.get(i) + ",    Time active " + LocalTime.now() + "\n");
            //ps.append("Deleted");
            }
            ps.close();
        } catch (IOException e) {
            System.out.println("ERROR Messege: " + e);
        }
    }

















   /* public ArrayList<String> logfilData(){
       Scanner fileScanner= null;
        try {
            fileScanner = new Scanner(new File("" ));
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
                System.out.println(lines);
            }
            fileScanner.close();

        } catch (IOException e) {
            System.out.println("ERROR Messege" + e);

        }
        return lines;
    }*/




}
