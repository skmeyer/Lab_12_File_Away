import javax.swing.*;
import java.io.File;
import java.nio.file.Path;

public class FileInspector
{
    public static void main(String[] args)
    {
        JFileChooser inspector = new JFileChooser();
        File selectedFile;
        String rec = "";

        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            inspector.setCurrentDirectory(workingDirectory);

            if (inspector.showOpenDialog(null)) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = inspector.getSelectedFile();
                Path file = selectedFile.toPath();

            }
        }
    }
}