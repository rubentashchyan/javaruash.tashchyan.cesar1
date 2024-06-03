import java.io.IOException;
import java.util.Random;

public class EncryptorManager implements EncryptorService {
    private int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    Random random = new Random(20);
    private RussianAlphabet alphabet;

    public FileManager getter;


    public EncryptorManager() {
        this.getter = getter;
        this.alphabet = alphabet;

    }


    public char[] FileToChars() throws IOException {

        return getter.getText().toCharArray();
    }



    @Override
    public String encryptorSevice() throws IOException  {

        char[] array = FileToChars();
        char[] copy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];

        }

        for (int i = 0; i < array.length; i++) {
            char c = copy[i];
            int index = alphabet.getAlphabet().indexOf(String.valueOf(c));
            array[i] = alphabet.getAlphabet().get((index + key) % alphabet.getAlphabet().size());


        }
        System.out.println(new String(array));
        getter.setText("");
        return new String(array);
    }




}










