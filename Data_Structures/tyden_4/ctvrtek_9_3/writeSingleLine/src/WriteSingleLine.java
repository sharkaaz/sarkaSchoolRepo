
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Sarka Marova");
        Path filePath = Paths.get("src/assets/my_file.txt");

        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Promin nelze zapsat do souboru!");
        }
    }
}



