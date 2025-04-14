import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;

public class FileInspector
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";
        int wordCount = 0;
        int charCount = 0;

        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);


            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                int line = 0;
                while(reader.ready())
                {
                    rec = reader.readLine();
                    charCount = rec.length() + charCount;
                    String [] word = rec.split(" ");
                    wordCount = word.length + wordCount;
                    line++;
                    System.out.println("[" + line + "] " + rec);
                }
                reader.close();
                System.out.println("Finished reading the file!");
                System.out.println("The file had " + line + " lines, " + wordCount + " words, and " + charCount + " characters." );

            }
            else
            {
                System.out.println("No file selected!");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No file found! Restart the program and try again.");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}