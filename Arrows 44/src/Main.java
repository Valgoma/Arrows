import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        String arrows = sc.next();
        String obrazets1 = ">>-->";
        String obrazets2 = "<--<<";
        Pattern p = Pattern.compile(obrazets1);
        Matcher m = p.matcher(arrows);
        int i = 0;
        while (m.find())
        {
            i++;
        }
        Pattern p2 = Pattern.compile(obrazets2);
        Matcher m2 = p.matcher(arrows);
        while (m2.find())
        {
            i++;
        }
        System.out.println(i);
        String s = String.valueOf(i);
        Files.writeString(Path.of("OUTPUT.TXT"), s);
    }
    }
