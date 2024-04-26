import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final FileManager getter;
    private final EncryptorManager shfr;

    public Menu(Scanner scanner, FileManager getter, EncryptorManager shfr) {
        this.getter = getter;
        this.shfr = shfr;
        this.scanner = scanner;
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
                getter.FileGetter();
//                System.out.println("Введите ключ");
//                shfr.Key(scanner.nextInt());
                String encryptor = shfr.encryptor();

                System.out.println("файл зашифрован, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                getter.FileWriter(encryptor);

            }

            if (comanda == 2) {
                System.out.println("введите адрес файла ");
                getter.FileGetter();
//                System.out.println("Введите ключ");
//                shfr.setKey(scanner.nextInt());
                String decryptor = shfr.decryptor();
                System.out.println("файл дешифрован, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                getter.FileWriter(decryptor);
            }
            if (comanda == 3) {
                System.out.println("введите адрес файла ");
                getter.FileGetter();
                String bruteforce = shfr.bruteforce();
                System.out.println("файл взломан, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                getter.FileWriter(bruteforce);

            }
        }
    }
}
