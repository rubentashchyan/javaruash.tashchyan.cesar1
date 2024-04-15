
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню");
        System.out.println("выберите действие");
        System.out.println("1 зашифровать файл");
        System.out.println("2 расшифровать файл");
        System.out.println("3 взломать файл");
        System.out.println("4 сохранить файл");


        textgetter Getter = new textgetter();


        textgetter getter2 = new textgetter();


        RussianOrtodoxEncryptor shfr= new RussianOrtodoxEncryptor(Getter);


        while (true) {


            int comanda = scanner.nextInt();
            scanner.nextLine();


            if (comanda == 1) {
                System.out.println("введите адрес файла ");
                Getter.FileGetter();
                shfr.encryptor();

                System.out.println("файл зашифрован, сохраните файл");

            }

            if (comanda == 2) {
                System.out.println("введите адрес файла ");
                Getter.FileGetter();
                shfr.decryptor();
                System.out.println("файл дешифрован, сохраните файл");
            }
            if (comanda == 3) {
                System.out.println("введите адрес файла ");
                Getter.FileGetter();
                shfr.bruteforce();
                System.out.println("файл взломан, сохраните файл");

            }
            if (comanda == 4) {
                System.out.println("введите адрес для сохранения файла");
                Getter.FileWriter();
            }
        }
    }
}