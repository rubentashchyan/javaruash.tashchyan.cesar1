import java.io.*;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class textgetter {
    Scanner scanner= new Scanner(System.in);
  public    String getfile;
   public  String writefile;
   public  String text = "";

    public textgetter() {

        this.encryptor = new RussianOrtodoxEncryptor(this);
    }

    private final RussianOrtodoxEncryptor encryptor;
public void FileGetter() throws IOException {
    getfile=scanner.nextLine();
    File file = new File(getfile);
    BufferedReader input =new BufferedReader(new FileReader(file));
   while (input.ready()) {
       text =  text + input.readLine();
   }
    input.close();



}

    public void FileWriter() throws IOException {

        writefile = scanner.nextLine();

        File file2 = new File(writefile);
        file2.createNewFile();
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file2))) {
            output.write(encryptor.encryptor());
        }

    }

    }
