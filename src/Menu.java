import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final FileManager getter;
    private final EncryptorManager shfr;

    private DecryptorManager dcrpt;

   private  BruteForce bruteForce;
    public Menu(Scanner scanner, FileManager getter, EncryptorManager shfr, DecryptorManager dcrpt, BruteForce bruteForc) {
        this.getter = getter;
        this.shfr = shfr;
        this.scanner = scanner;
        this.dcrpt = dcrpt;
        this.bruteForce = bruteForc;
    }



    public void start() throws IOException {
        while (true) {
            System.out.println("Меню");
            System.out.println("выберите действие");
            System.out.println("1 зашифровать файл");
            System.out.println("2 расшифровать файл");
            System.out.println("3 взломать файл");


            int comanda = scanner.nextInt();
            scanner.nextLine();


            if (comanda == 1) {
                System.out.println("введите адрес файла ");
                getter.readFile();
                System.out.println("Введите ключ");
                shfr.setKey(scanner.nextInt());
                String encryptor = shfr.encryptorSevice();

                System.out.println("файл зашифрован, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                getter.writeFile(encryptor);

            }

            if (comanda == 2) {
                System.out.println("введите адрес файла ");
                getter.readFile();
                System.out.println("Введите ключ");
                dcrpt.setKey(scanner.nextInt());
                String decryptor = dcrpt.encryptorSevice();
                System.out.println("файл дешифрован, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                getter.writeFile(decryptor);
            }
            if (comanda == 3) {

                System.out.println(bruteForce.bruteforce());

            }
        }
    }
}
