import java.io.*;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileManager {
    private final Scanner scanner;
    private String InputFileName;
    private String OutputFileName;
    private String text = "";

    public FileManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getFile() {
        return InputFileName;
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

    public String getOutputFileName() {
        return OutputFileName;
    }

    public void setOutputFileName(String outputFileName) {this.OutputFileName =  OutputFileName; }

    public void setInputFileName (String inputFileName) {
        this.InputFileName = InputFileName;
    }


    public void readFile() throws IOException {
        InputFileName = scanner.nextLine();
        File file = new File(InputFileName);
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (input.ready()) {
            text = text + input.readLine();
        }
        input.close();
    }

    public void writerFile(String text) throws IOException {

        OutputFileName = scanner.nextLine();

        File file2 = new File(OutputFileName);
        file2.createNewFile();
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file2))) {
            output.write(text);
        }

    }

}
