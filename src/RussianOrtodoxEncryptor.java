import java.io.IOException;
import java.util.Random;

public class RussianOrtodoxEncryptor {
    public int key = 2;
    Random random = new Random(20);


    public textgetter getter;


    public RussianOrtodoxEncryptor(Textgetter getter) {
        this.getter = getter;
    }


    public char[] RussianAlphabet() {
        RussianAlphabet alph = new RussianAlphabet();
        return alph.arrayListToChars();
    }

    public char[] FileToChars() throws IOException {

        return getter.text.toCharArray();
    }


    public String encryptor() throws IOException {

        char[] array = FileToChars();
        char[] copy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];

        }

        for (int i = 0; i < array.length; i++) {
            char c = copy[i];
            int index = RussianAlphabet.alphabet.indexOf(String.valueOf(c));
            array[i] = RussianAlphabet()[(index + key) % RussianAlphabet.alphabet.size()];


        }
        System.out.println(new String(array));
        getter.text = "";
        return new String(array);
    }

    public String decryptor() throws IOException {

        char[] array = FileToChars();
//         char [] copy = array;
        char[] copy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];

        }
        for (int i = 0; i < array.length; i++) {
            char c = copy[i];
            int index = RussianAlphabet.alphabet.indexOf(String.valueOf(c));
            array[i] = RussianAlphabet()[(index - key + RussianAlphabet.alphabet.size()) % RussianAlphabet.alphabet.size()];
        }
        System.out.println(new String(array));
        getter.text = "";
        return new String(array);
    }


    public String bruteforce() throws IOException {

        char[] array = FileToChars();

        char[] copy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];

        }
        int randomkey = 0;
        while (randomkey != key) {
            randomkey = random.nextInt(1, 20);
            for (int i = 0; i < array.length; i++) {
                char c = copy[i];
                int index = RussianAlphabet.alphabet.indexOf(String.valueOf(c));
                array[i] = RussianAlphabet()[(index - randomkey + RussianAlphabet.alphabet.size()) % RussianAlphabet.alphabet.size()];
            }
            if (randomkey != key) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = copy[i];

                }
            }

        }
        System.out.println(new String(array));
        getter.text = "";
        return new String(array);
    }

}










