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
        char[] mass =arrows.toCharArray();
        int i = 0;
        for (int k=0; k < arrows.length()-1; k++)
        {
            if (mass[k] == '<')
            {
               System.out.println(k);
               if (mass[k+1] == '-' && mass[k+2] == '-' && mass[k+3] == '<' && mass[k+4] == '<')
               {
                   System.out.println("YES");
                   i++;
               }
            }
            if (mass[k] == '>')
            {
                if (mass[k-1] == '-' && mass[k-2] == '-' && mass[k-3] == '>' && mass[k-4] == '>')
                {
                    System.out.println("YES");
                    i++;
                }
            }
        }
        String s = String.valueOf(i);
        Files.writeString(Path.of("OUTPUT.TXT"), s);
    }
    }
