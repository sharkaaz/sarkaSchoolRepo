import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {

        myFirstMultipleLines("my_multiple_file.txt", "konici", 4);

    }

    private static void myFirstMultipleLines(String MultiFile, String word, int number) {


        List<String> content = new ArrayList();
        for (int i = 0; i < number; i++) {
            content.add(word);

        }

        Path filePath = Paths.get(MultiFile);

        try {
            Files.write(filePath, content);
        } catch (IOException e) {

        }
    }
}









