package lesson20;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    private static Map<String, Integer> result = new HashMap<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> lines = Files.readAllLines(new File("wap.txt").toPath());

        int cpus = Runtime.getRuntime().availableProcessors();

        List<WordCountThread> workers = new ArrayList<>();

        for (int i = 0; i < cpus; i++) {
            // TODO implement
//            WordCountThread wct = new WordCountThread(lines.subList()); // разделить lines на равные части числом cpus
//
//            workers.add(wct);
        }

        for (WordCountThread worker : workers)
            worker.join();

        // Выбрать топ 10 из result
    }

    private static class WordCountThread extends Thread {
        private List<String> words;
        private Map<String, Integer> wordCnt = new HashMap<>();

        public WordCountThread(List<String> words) {
            this.words = words;
        }

        @Override
        public void run() {
            // Считаем в wordCnt
            for (String word : words) {

            }

            // Сливаем в общую Map
        }
    }
}
