import java.util.Scanner;
public class InputHandler {
    Scanner scanner;

    InputHandler(){
        scanner = new Scanner(System.in);
    }

    public String readString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int readInt() {
        // wait for integer input
        while(!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
}