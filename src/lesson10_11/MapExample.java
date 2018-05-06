package lesson10_11;

import java.util.*;

public class MapExample {

    final static Map<String, String> finalMap = new LinkedHashMap<>();

    public static void main(String[] args){
        finalMap.put("90", "90val");
        finalMap.put("9777", "9777val");
        System.out.println(finalMap.get("9777"));

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key", "value");
        hashMap.put(null, "value");
        hashMap.put(null, "value1");

        System.out.println(hashMap.get(null));

        for (Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey() +
                    " : " + entry.getValue());
        }

//        TreeMap - для хранения элементов применяет
//        красно-черное дерево
//        Объекты сохраняются в отсортированном порядке:
//        ключи по возрастанию

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("333", "value1");
        treeMap.put("67", "value2");
        treeMap.put("key", "value3");
//        treeMap.put(null, "value4");
        for (Map.Entry entry: treeMap.entrySet()){
            System.out.println(entry.getKey() +
                    " : " + entry.getValue());
        }


//        TreeMap();
//        TreeMap(Comparator comp)
//        TreeMap(Map m)
//        TreeMap(SortedMap sortm)

//        class CustCompr implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }

//        LinkedHashMap - расширяет HashMap
//        порядок хранения элементов определяется порядком установки

        Map<String, String> lnkMap = new LinkedHashMap<>();
        lnkMap.put("333", "value1");
        lnkMap.put("key", "value3");
        lnkMap.put(null, "value4");
        for (Map.Entry entry: lnkMap.entrySet()){
            System.out.println(entry.getKey() +
                    " : " + entry.getValue());
        }

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "rwrw");
        newMap.put(2, "rwrw");
        newMap.put(6, "rwrw");
        newMap.put(12, "rwrw");
        Map<Integer, String> newMap2 = Collections.unmodifiableMap(newMap);
//        newMap2.put(45, "rgfdsrf");






    }

}
