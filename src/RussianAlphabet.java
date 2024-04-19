import java.util.ArrayList;
import java.util.List;

public class RussianAlphabet {

    public static ArrayList<String> alphabet = new ArrayList<>(List.of("A", "а", "Б", "б", "В", "в", "Г", "г", "Д", "д", "Е", "е", "Ё", "ё",
            "Ж", "ж", "З", "з", "И", "и", "К", "к", "Л", "л", "М", "м", "Н", "н", "О", "о", "П", "п", "Р", "р", "С", "с", "Т", "т", "У", "у",
            "Ф", "ф", "Х", "х", "Ц", "ц", "Ч", "ч", "Ш", "ш", "Щ", "щ", "Ъ", "ъ", "Ы", "ы", "Ь", "ь", "Э", "э", "Ю", "ю", "Я", "я", ",", ".", "!", "?", "(", ")", " "));


    public char[] arrayListToChars() {
        StringBuilder builder = new StringBuilder();
        for (String str : alphabet) {

            builder.append(str);

        }
        String concatenatedString = builder.toString();
        return concatenatedString.toCharArray();
    }


}



