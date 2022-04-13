import java.io.File;
import java.util.Scanner;

public class CreateDirectory {
    private Scanner scanner = new Scanner(System.in);
    private String NameDirectory = scanner.nextLine();

    public void createDirectory(){

        try {
            File Directory = new File(NameDirectory);
            if (!Directory.exists()){
                if (Directory.mkdir()){
                    System.out.println("Directory successful created");
                }
            }
            else {
                System.out.println("Directory already exit");
            }

        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Error");
        }
    }

        }