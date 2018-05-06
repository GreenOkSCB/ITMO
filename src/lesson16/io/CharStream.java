package lesson16.io;

// символные потоки
//Классы потоков символов наследуются от
// java.io.Reader
//java.io.Writer

import java.io.*;
import java.nio.charset.Charset;

//Классы для файлового ввода и вывода:
// java.io.FileReader
// java.io.FileWriter
public class CharStream {
    // запись в файл
    private void writeToFile(String str, File file)
            throws IOException{
        try(Writer writer = new FileWriter(file)){
            writer.write(str);
        }
    }


    private String readToStr(File file)
            throws IOException{
        try(Reader reader = new FileReader(file)) {
            StringBuilder sb = new StringBuilder();
            char[] buf = new char[512];
            int len;
            while((len = reader.read(buf)) > 0){
                sb.append(buf, 0, len);
            }
            return sb.toString();
        }
    }


//    любой поток байт можно превратить в поток символов,
//    обернув его в java.io.InputStreamReader
//            (мост между классами InputStream и Reader)
//    или в OutputStreamWriter
//            (мост между классами OutputStream и Writer)

//    try (Reader reader =
//      new InputStreamReader(
//        new ByteArrayInputStream(byteArr, Charset.forName("UTF-8))
//      ))

    private void readWithBuffer(File file){
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), Charset.forName("UTF-8")
                )
        )) {

            String str;
            while((str = reader.readLine()) != null){
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

}

