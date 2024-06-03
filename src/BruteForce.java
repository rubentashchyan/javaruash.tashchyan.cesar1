import java.io.IOException;
import java.util.Random;

public class BruteForce {


    Random random = new Random(20);
    EncryptorManager service = new EncryptorManager();



    int searchedKey = service.getKey();
    public int bruteforce() throws IOException {

        int randomkey = 0;
        while (randomkey != service.getKey()) {
            randomkey = random.nextInt(1, 20);

        }
        if (randomkey == searchedKey);
         return searchedKey;
    }

}