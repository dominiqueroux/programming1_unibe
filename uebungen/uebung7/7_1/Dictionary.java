/* ************************************************************************** *\
 * *                 Programmierung 1 HS 2016 - Serie 7-1  
 * *                 Bachofner Marc      15-135-916
 * *                 Dominique Roux      16-100-661
 * \* ************************************************************************ */

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Dictionary
{
    private HashMap<String, List<String>> map;

    public Dictionary() {
        this.map = new HashMap<String, List<String>>();
    }

    public void addTranslations(String word, String[] translations) {
        List<String> newTranslations = new ArrayList<String>(Arrays.asList(translations));

        if (map.containsKey(word)) {
            (this.map.get(word)).addAll(newTranslations);
        } else {
            this.map.put(word, newTranslations);
        }
    }

    public List<String> translate(String word) throws WordNotFoundException {
        if (map.containsKey(word)) {
            return this.map.get(word);
        } else {
            throw new WordNotFoundException();
        }
    }

}
