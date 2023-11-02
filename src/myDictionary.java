import java.util.HashSet;

public class myDictionary {
        HashSet<Language> dictionaries = new HashSet<>();
        void add(Language locale){
            dictionaries.add(locale);
        }
        void add(String languageName, String word, String tranlation){
            Language newLang = new Language(languageName);
            dictionaries.add(newLang);
            newLang.setWord(word, tranlation);
        }
        void add(String languageName, String word, String[] tranlations){
            Language newLang = new Language(languageName);
            newLang.setWords(word, tranlations);
        }
        void  printLang(){
            System.out.println("Доступные языки:");
            for(Language locale: dictionaries){
                System.out.println(locale.name);
            }
        }
        void printLangAll(){
            System.out.println("Доступные языки:");
            for(Language locale: dictionaries){
                System.out.println(locale.name);
                locale.printLocale();
            }
        }
        void deleteLang(String lang){
            for (Language dictionary: this.dictionaries){
                if (dictionary.name.contains(lang)){
                    dictionaries.remove(dictionary);
                }
            }
        }
        void clear(){
            this.dictionaries.clear();
        }
}
