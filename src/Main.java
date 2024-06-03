
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileManager getter = new FileManager(scanner);
        RussianAlphabet alphabet = new RussianAlphabet();
        EncryptorManager shfr = new EncryptorManager();
        DecryptorManager dcrpt = new DecryptorManager(alphabet, getter);
        BruteForce bruteForce = new BruteForce();
        Menu menu = new Menu(scanner, getter, shfr, dcrpt, bruteForce);

        menu.start();
    }
}