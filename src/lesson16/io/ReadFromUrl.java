package lesson16.io;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class ReadFromUrl {
    private static final Charset CHARSET = Charset.forName("UTF-8");

    private String readText(InputStream in) throws IOException {
        InputStreamReader reader = new InputStreamReader(in, CHARSET);

        StringBuilder sb = new StringBuilder();

        char[] buf = new char[16];

        int len;

        while ((len = reader.read(buf)) > 0)
            sb.append(buf, 0, len);

        return sb.toString();
    }


    private String readText(File file) throws IOException {
        try (InputStream in = new FileInputStream(file)) {
            return readText(in);
        }
    }


    private String readUrl(String url) throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

        con.setRequestProperty("Accept-Charset", CHARSET.name());

        try (InputStream in = con.getInputStream()) {
            return readText(in);
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFromUrl readFromUrl = new ReadFromUrl();
        System.out.println(readFromUrl.readUrl("https://www.intuit.ru/studies/courses/16/16/lecture/27133?page=4"));
    }
}