package lesson16.io;


//IO Stream - однонаправленная последовательность байт
// из источника в программу или наоборот

// Потоки байт
//Классы, работающие с потоками байт наследуются от абстрактных:
//java.io.InputStream
//java.io.OutputStream

import java.io.*;
import java.nio.charset.Charset;

public class ByteStream {
//    java.io.File для представления
// файли или директории в программе
//    основные методы
//     String getPath()
//    String getName()
//    boolean isFile()
//    boolean isDirectory()
//    boolean exists()
//    long length()
//    boolean delete()

//    FileOutputStream - запись в файл
    private void writeToFile(String str,
                             File file,
                             boolean append) throws IOException {

        try(OutputStream out = new FileOutputStream(file, append)){
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            out.write(bytes);
        }
    }

//    FileInputStream - чтение из файла
    private String readWithoutTryRes(File file) throws IOException{
        InputStream in = null;
//        ByteArrayInputStream - позволяет записывать данные в поток,
// а по окончании получить записанные данные
//        ByteArrayOutputStream - позволяет создать входной поток,
// который будет считывать данные из массива байт, при помощи toByteArray()
//        можно получить их в виде массива

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            in = new FileInputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0){
                bout.write(buf, 0, len);
            }
            return new String(bout.toByteArray());
        }
        finally {
            bout.close();
            if(in != null){
                in.close();
            }
        }
    }
    // Java7 try-with-resources - вызывает метод close у всех объектов,
//    даже если они бросают исключения
//    объекты должны реализовывать интерфейс AutoCloseable
    private String readWithTryRes(File file) throws IOException{
        try (InputStream in = new FileInputStream(file);
        ByteArrayOutputStream bout = new ByteArrayOutputStream()) {

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0){
                bout.write(buf, 0, len);
            }
            return new String(bout.toByteArray());
        }
    }

    private String readWithBuffer(File file) throws IOException{
        try(InputStream in = new BufferedInputStream(new FileInputStream(file));
            ByteArrayOutputStream bout = new ByteArrayOutputStream()) {

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0){
                bout.write(buf, 0, len);
            }
            return new String(bout.toByteArray());
        }
    }



    public static void main(String[] args) throws IOException {
        ByteStream bs = new ByteStream();
        File file = new File("tst.txt");
        bs.writeToFile("string1\nstring2\nstring3",
                file,
                true);

        System.out.println(bs.readWithoutTryRes(file));

    }
}