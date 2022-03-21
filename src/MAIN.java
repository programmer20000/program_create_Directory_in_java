import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        CreateDirectory createDirectory = new CreateDirectory();
        createDirectory.createDirectory();
        CloseProgram();
    }

    public static void CloseProgram() {
        System.out.println("Your want to exit:");
        System.out.println("if yes enter Y if not enter n");

        Scanner scanner = new Scanner(System.in);
        String exitProgram = scanner.nextLine();
        CreateDirectory createDirectory = new CreateDirectory();

        String symbolExit = "y";
        String symbolContinue = "n";

        while (true){
            if (exitProgram.equals(symbolExit)){
                break;
            }
            if (exitProgram.equals(symbolContinue)){
                System.out.println("Enter name file:");
                createDirectory.createDirectory();
            }
        }

    }
}
