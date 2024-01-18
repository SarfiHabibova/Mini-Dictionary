package MiniDictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dict {
    private final Map<String, String> words;

    public Dict() {
        this.words = new HashMap<>();
    }

    public void addWord(String EnglishWord, String AzerbTranslation) {
        words.put(EnglishWord, AzerbTranslation);
    }

    public String getTranslation(String EnglishWord) {
        return words.get(EnglishWord);
    }

    public void saveToFile(String fileName, String filePath) {
        File file = new File(filePath + File.separator + fileName + ".txt");

        try (FileWriter fWriter = new FileWriter(file)) {
            fWriter.write(words.size());
            fWriter.write(System.lineSeparator());

            for (Map.Entry<String, String> entry : words.entrySet()) {
                fWriter.write(entry.getKey() + "=" + entry.getValue());
                fWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
