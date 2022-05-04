import java.io.File;

public class CreateDirectory {

    public void createDirectory(String NameFile) {

        try {
            File Directory = new File(NameFile);
            if (!Directory.exists()){
                Directory.mkdir();
                System.out.println("folder successful created");
            }
            else{
                System.out.println("folder already created");
            }

        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}