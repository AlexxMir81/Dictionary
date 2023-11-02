import java.util.HashSet;

public class myDictionary {
        HashSet<Language> dictionaries = new HashSet<>();
        void add(Language locale){
            dictionaries.add(locale);
        }
        void add(String languageName, String word, String tranlation){
            Language newLang = new Language(languageName);
            newLang.setWord(word, tranlation);
            dictionaries.add(newLang);
        }
        void add(String languageName, String word, String[] tranlations){
            Language newLang = new Language(languageName);
            newLang.setWords(word, tranlations);
            dictionaries.add(newLang);
        }
        void  printLang(){
            System.out.println("Доступные языки:");
            for(Language locale: dictionaries){
                System.out.println(locale.name);
            }
        }
        void printLangAll(){
            System.out.println("Доступные языки:");
            for(Language language: dictionaries){
                System.out.println(language.name);
                language.printLWords();
            }
        }
        void deleteLang(String lang){
            this.dictionaries.removeIf(language -> language.name.equals(lang));
        }
        void clear(){
            this.dictionaries.clear();
        }
        void search(String languageName, String searchword){
            int counter=0;
            for (Language language: dictionaries){
                if(language.name == languageName){
                    System.out.println("Найдено языков: "+ ++counter+".");
                    language.search(searchword);
                }
            }
        }
}
