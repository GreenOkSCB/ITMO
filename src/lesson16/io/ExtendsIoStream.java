package lesson16.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ExtendsIoStream {
//    File file = new File("tst.txt");
//    List<String> lst = Files.readAllLines(file.toPath());
//    for(String str: lst){
//        System.out.println(str);
//    }
//
//
//    Files.lines(Path.get(file)),Charset.forName("UTF-8")
//            .forEach(System.out::println);
//

// расширение функционала потоков -
// IO Stream позволяет расширять функциональность
// потоков путём оборачивания их в другие потоки

//    Например, для упрощенной работы с примитивами и строками можно
//    стандартные потоки обернуть в java.io.DataInputStream
//    и java.io.DataOutputStream



    private void dataInputStream(InputStream in) throws IOException{
        DataInputStream  data = new DataInputStream(in);
        int someInt = data.readInt();
        boolean someBoolean = data.readBoolean();
        String someStr = data.readUTF();
        System.out.printf("%s %s %s", someInt, someBoolean, someStr);
    }

    private void dataOutputStream(OutputStream out) throws IOException{
        DataOutputStream dataOut = new DataOutputStream(out);
        dataOut.writeInt(34234245);
        dataOut.writeBoolean(true);
        dataOut.writeUTF("Hello");
    }

    public static void main(String[] args) throws IOException{
        ExtendsIoStream eio = new ExtendsIoStream();
//        try(OutputStream out = new FileOutputStream(new File("tst.txt"))) {
//            eio.dataOutputStream(out);
//        }
//        try(InputStream in = new FileInputStream(new File("tst.txt"))) {
//            eio.dataInputStream(in);
//        }

        eio.randomAccessFile(new File("tst.txt"));
    }

    private void randomAccessFile(File file)throws IOException{
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            long offset = 1024;
            raf.seek(offset);
            raf.writeUTF("Hey");
            raf.seek(0);
            raf.writeLong(offset);
        }

        try(RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long offset = raf.readLong();
            raf.seek(offset);
            String mess = raf.readUTF();
            System.out.println("Mess: " + mess);
        }
    }


}
