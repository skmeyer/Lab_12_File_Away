import java.util.ArrayList;
import java.util.Scanner;

public class DataSaver
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Use the following format: [FirstName, LastName, ID, Email, BirthYear]");
        ArrayList <String> data = new ArrayList<>();
        String record = SafeInput.getRegExString(in,"Enter your record", "^\\d{},\\d{},\\d{6},\\d{},\\d{4}$");
        

    }
}