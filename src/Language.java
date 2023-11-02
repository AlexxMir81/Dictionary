import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Language {

        String name;
        private HashMap<String, HashSet<String>> words;
        public Language(String name) {
            this.name = name;
            this.words = new HashMap<String, HashSet<String>>();
        }

        public void setWord(String word, String tranlation) {
            HashSet<String> translations = new HashSet<String>();
            translations.add(tranlation.toLowerCase());
            this.words.put(word.toLowerCase(), translations);
        }
        public void setWords(String word, String[] translations) {
            HashSet<String> trans = new HashSet<String>();
            for (var i = 0; i< translations.length;i++)translations[i]=translations[i].toLowerCase();
            trans.addAll(List.of(translations));
            this.words.put(word.toLowerCase(), trans);
        }
        void printLWords(){
            for(Map.Entry<String, HashSet<String>> word: this.words.entrySet()){
                printword(word.getKey());
            }
        }
        void printword(String printedword){
            for(Map.Entry<String, HashSet<String>> word: this.words.entrySet()){
                if(word.getKey().equals(printedword)){
                    System.out.println("Слово: "+word.getKey());
                    System.out.println("Перевод:");
                    for (String transword: word.getValue()){
                        System.out.println("\t"+transword);
                    }
                }
            }
        }
        boolean deleteWord(String word){
            for(Map.Entry<String, HashSet<String>> locale: this.words.entrySet()){
                if (locale.getKey().contains(word.toLowerCase())) {
                    words.remove(locale.getKey());
                    return  true;
                }
            }
            return  false;
        }
        @Override
        public String toString() {
            return  "Locale{word="+ words +'}';
        }
        public void search(String searchword){
            int counter = 0;
            for(Map.Entry<String, HashSet<String>> word: this.words.entrySet()){
                if(word.getKey().contains(searchword)){
                    System.out.println("Найдено слов: "+ ++counter+".");
                    printword(word.getKey());
                }
            }
        }
        public void specifictSsearch(String searchword){
            int counter = 0;
            for(Map.Entry<String, HashSet<String>> word: this.words.entrySet()){
                if(word.getKey().equalsIgnoreCase(searchword)){
                    System.out.println("Найдено слов: "+ ++counter +".");
                    printword(searchword);
                }
            }
        }
}
