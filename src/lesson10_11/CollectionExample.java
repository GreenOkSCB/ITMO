package lesson10_11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class CollectionExample {
    private String name;
    private int count;

    public CollectionExample(String name, int count){
        this.name = name;
        this.count = count;
    }



    public static void main(String[] args) throws IOException {
        CollectionExample col = new CollectionExample("ColEx", 4);
        CollectionExample col2 = new CollectionExample("ColEx", 4);
        CollectionExample col3 = new CollectionExample("Example", 2);

        System.out.println(col.hashCode());
        System.out.println(col2.hashCode());
        System.out.println(col3.hashCode());

        System.out.println(col.equals(col2));


//            1. interface Set (
//        коллекция, которая не может содержать дублирующихся элементов
//            HashSet - реализация на основе хеш-таблицы.
//                Это наиболее эффективная реализация,
//                но она не гарантирует сохранение порядка элементов при обходе
        Set<String> strings = new HashSet<>();
        System.out.println(strings.add("ewewew"));
        System.out.println(strings.add("wewew"));
        System.out.println(strings.add("ggg"));
        System.out.println(strings.add("iuiui"));
        System.out.println(strings.size());
        for (String str: strings){
            System.out.println(str);
        }
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println("with iterator " + iterator.next());
        }


        Set<CollectionExample> colex = new HashSet<>();

        System.out.println(colex.add(col));
        System.out.println(colex.add(col2));

        colex.remove(col);

        System.out.println(colex.size());

        System.out.println(colex.contains(col2));

//   LinkedHashSet - реализация на основе хеш-таблицы,
//       но дополнительно пролинкованная связанным списком.
//       Эта реализация избавляет от хаотичного порядка элементов
//       и лишь незначительно хуже по эффективности HashSet-а.
//   TreeSet - упорядочивает элементы в соответствии с их значениями,
//        но работает значительно медленнее HashSet
//        )

//            2. interface List - упорядоченная коллекция,
//           может содержать дублирующиеся элементы

        // доступ, удаление, добавление элементов по индексу
        // поиск элементов
        // замена элементов
        // операции с частью списка - subList([int from, int to))
//        ListIterator - расширенный итератор
        List<String> arrLst = new ArrayList<>();
        List<String> linkedLst = new LinkedList<>();

//        arrLst.subList(1, 3).clear();
        arrLst.size();

//            3. interface Queue - однонаправленная очередь
//               interface Deque - двунаправленная очередь
//                addFirst()
//                addLast()
//                getFirst()
//                getLast()


        Queue<String> queue = new PriorityQueue<>();
        Deque<String> deque = new ArrayDeque<>();



        File txt = new File("src/collections/collection.txt");
        List<String> lines = Files.readAllLines(txt.toPath());
        System.out.println(lines);

        List<String> wordsLst = new ArrayList<>();
        for (String str1: lines){
             wordsLst.add(str1.toLowerCase().trim().replace(" ", ""));

        }

        for (String wordL: wordsLst){
            System.out.println(wordL);
        }

    }
}
