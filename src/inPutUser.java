import java.util.Scanner;
public class inPutUser { //для проверки на int
    public int userCommand;
    public  Scanner scan = new Scanner(System.in);
    public int inPut() {
        if (!scan.hasNextInt()) {
            while (!scan.hasNextInt()) {
                System.out.println("Необходимо вводить числовое значение");
                scan.next();
            }
            userCommand = scan.nextInt();
        } else userCommand = scan.nextInt();
        return userCommand;
    }
}
