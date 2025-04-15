import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSaver
{
    public static void main(String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        ArrayList <String> data = new ArrayList<>();
        do
        {
            System.out.println("Use the following format: [FirstName, LastName, ID, Email, BirthYear]");
            String record = SafeInput.getRegExString(in,"Enter your record", "^[A-Za-z]*,\\s[A-Za-z]*,\\s\\d{6},\\s[A-Za-z0-9.@-_~+]*,\\s\\d{4}$");
            data.add(record);
            boolean continueYN = SafeInput.getYNConfirm(in, "Would you like to continue entering records?");
            if(!continueYN)
            {
                done = true;
            }
        }while(!done);
        for(int x = 0; x < data.size(); x++)
        {
            int itemNum = x + 1;
            System.out.println("[" + itemNum + "] " + data.get(x));
        }
        System.out.println("Enter the name for your file: ");
        String fileName = in.nextLine();
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\" + fileName + ".csv");
        
        

    }
}