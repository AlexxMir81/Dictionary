import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //Добавление раскладки
        myDictionary dicrionary = new myDictionary();
        Language ru = new Language("ru");

        dicrionary.add(ru);
        dicrionary.printLang();
        System.out.println("=============================");

        ru.setWord("история", "history");
        ru.setWords("стОл", new String[]{"tables", "taBleSes"});
        ru.setWords("стОлБ", new String[]{"post", "pile"});
        System.out.println(ru.toString());
        System.out.println("=============================");

        ru.printLocale();
        dicrionary.printLangAll();
        dicrionary.deleteLang("ru");
        ru.deleteWord("стол");
        ru.printLocale();
        System.out.println("=============================");

        dicrionary.add("eng", "victory", "победа");
        dicrionary.printLang();
        System.out.println("=============================");

        ru.search("стол");
        ru.specifictSsearch("стол");
        System.out.println("=============================");

        dicrionary.deleteLang("ru");
        dicrionary.printLangAll();
        System.out.println("=============================");

        dicrionary.clear();
        dicrionary.printLangAll();
    }
}