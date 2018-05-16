package lesson22;

import lesson20.WordCount;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.stream.Collectors.toList;

public class WordCountPool {
    public static void main(String[] args) {
        InputStream in = WordCount.class.getClassLoader().getResourceAsStream("wap.txt");

        BufferedReader rdr = new BufferedReader(new InputStreamReader(in));

        List<String> lines = rdr.lines().collect(toList());

        int cpus = Runtime.getRuntime().availableProcessors();

        ExecutorService pool = Executors.newFixedThreadPool(cpus);

        List<Future<Map<String, Integer>>> futs = new ArrayList<>();

        for (int i = 0; i < cpus; i++) {
            // TODO submit WordCountTask into pool, futures add to futs
        }

        for (Future<Map<String, Integer>> fut : futs) {
            // TODO collect results
        }

        pool.shutdown();
    }

    private static class WordCountTask implements Callable<Map<String, Integer>> {
        private final List<String> lines;

        public WordCountTask(List<String> lines) {
            this.lines = lines;
        }

        @Override
        public Map<String, Integer> call() throws Exception {
            Map<String, Integer> res = new HashMap<>();

            // TODO count words

            return res;
        }
    }
}
