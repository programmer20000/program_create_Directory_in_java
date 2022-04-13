import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        CreateDirectory createDirectory = new CreateDirectory();
        createDirectory.createDirectory();
        CloseProgram();
    }

    public static void CloseProgram() {
        System.out.println("if yes enter Y if not enter n");
        System.out.println("Your want to exit:");;

        Scanner scanner = new Scanner(System.in);
        String exitProgram = scanner.nextLine();
        CreateDirectory createDirectory = new CreateDirectory();

        String symbolContinue = "n";
        String symbolExit = "y";

        while (!exitProgram.equals(symbolExit)){
            createDirectory.createDirectory();
        }

    }
}
