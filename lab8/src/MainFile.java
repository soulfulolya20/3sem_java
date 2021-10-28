import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        File inFile = null;
        FileWriter writer = null;

        try {
            inFile = File.createTempFile("myFile", ".txt");
            writer = new FileWriter(inFile, false);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-2);
        }

        while (true){
            String a = in.nextLine();
            if(a.equals("0")) break;

            try
            {
                writer.write(a+'\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }

        }

        try {
            Runtime.getRuntime().exec(new String[]{"cmd.exe","/c","start " + inFile.getAbsolutePath()});
        } catch (IOException e) {
            e.printStackTrace();
        }

        inFile.delete();


    }
}