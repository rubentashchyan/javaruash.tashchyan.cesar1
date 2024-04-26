import java.io.*;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileManager {
    private final Scanner scanner;
    private String getfile;
    private String writefile;
   private String text = "";

    public FileManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getFile() {
        return getfile;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWritefile() {
        return writefile;
    }

    public void setWritefile(String writefile) {
        this.writefile = writefile;
    }

    public void setGetfile(String getfile) {
        this.getfile = getfile;
    }


    public void ReadFile() throws IOException {
        getfile = scanner.nextLine();
        File file = new File(getfile);
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (input.ready()) {
            text = text + input.readLine();
        }
        input.close();
    }

    public void WriterFile (String text) throws IOException {

        writefile = scanner.nextLine();

        File file2 = new File(writefile);
        file2.createNewFile();
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file2))) {
            output.write(text);
        }

    }

}
