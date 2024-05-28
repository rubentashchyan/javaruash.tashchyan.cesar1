import java.io.*;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileManager {
    private final Scanner scanner;
    private String inputFileName;
    private String outputFileName;
    private String text = "";

    public FileManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getFile() {
        return inputFileName;
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
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {this.outputFileName = this.outputFileName; }

    public void setInputFileName (String inputFileName) {
        this.inputFileName = this.inputFileName;
    }


    public void readFile() throws IOException {
        inputFileName = scanner.nextLine();
        File sourceFile = new File(inputFileName);
        BufferedReader input = new BufferedReader(new FileReader(sourceFile));
        while (input.ready()) {
            text = text + input.readLine();
        }
        input.close();
    }

    public void writeFile(String text) throws IOException {

        outputFileName = scanner.nextLine();

        File destinationFile = new File(outputFileName);
        destinationFile.createNewFile();
        try (BufferedWriter output = new BufferedWriter(new FileWriter(destinationFile))) {
            output.write(text);
        }

    }

}
