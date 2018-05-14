package lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static java.util.stream.Collectors.toList;

public class WordCountQueue {
    private static Map<String, Integer> result = new HashMap<>();
    private static final String STOP = new String();

    // TODO
    // Задача №2
    // Результаты сложить в другую очередь для main,
    // а main сольет их вместе.

    public static void main(String[] args) throws IOException, InterruptedException {
        InputStream in = WordCountQueue.class.getClassLoader().getResourceAsStream("wap.txt");

        BufferedReader rdr = new BufferedReader(new InputStreamReader(in));

        List<String> lines = rdr.lines().collect(toList());

        int cpus = Runtime.getRuntime().availableProcessors();

        List<WordCountThread> workers = new ArrayList<>();
        BlockingQueue<String> linesQueue = new LinkedBlockingQueue<>();

        for (int i = 0; i < cpus; i++) {
            // TODO implement
            WordCountThread wct = new WordCountThread(linesQueue);

            workers.add(wct);
            wct.start();
        }

        // В добавить lines в linesQueue.

        for (WordCountThread worker : workers)
            worker.join();

        // Выбрать топ 10 из result
    }

    private static class WordCountThread extends Thread {
        private final BlockingQueue<String> linesQueue;
        private Map<String, Integer> wordCnt = new HashMap<>();

        public WordCountThread(BlockingQueue<String> linesQueue) {
            this.linesQueue = linesQueue;
        }

        @Override
        public void run() {
            // Считаем в wordCnt
            while (!isInterrupted()) {
                try {
                    String line = linesQueue.take();

                    if (line == STOP)
                        break;
                    // Код обработки строки,
                    // добавляем результат в wordCnt


                } catch (InterruptedException e) {
                    return;
                }
            }

            // Сливаем в общую Map
        }
    }
}
