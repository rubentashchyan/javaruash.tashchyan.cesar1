
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);





        textgetter Getter = new textgetter();


        RussianOrtodoxEncryptor shfr= new RussianOrtodoxEncryptor(Getter);


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
                Getter.FileGetter();
                String encryptor = shfr.encryptor();

                System.out.println("файл зашифрован, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                Getter.FileWriter(encryptor);

            }

            if (comanda == 2) {
                System.out.println("введите адрес файла ");
                Getter.FileGetter();
                String decryptor = shfr.decryptor();
                System.out.println("файл дешифрован, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                Getter.FileWriter(decryptor);
            }
            if (comanda == 3) {
                System.out.println("введите адрес файла ");
                Getter.FileGetter();
                String bruteforce = shfr.bruteforce();
                System.out.println("файл взломан, сохраните файл");
                System.out.println("введите адрес для сохранения файла");
                Getter.FileWriter(bruteforce);

            }

        }
    }
}