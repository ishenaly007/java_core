package collections;

import java.util.*;

public class Lists {
    ArrayList arrayList = new ArrayList<>();//new ArrayList<>(int capacity)начальная емкость равна 10
    /* есть у него loadFactor, по дефолту он 75%, то ессть если  75 заполнено,
     то список удваивается создав новый список */
    //  +  fast index access,  +  fast add and remove atLast
    //  -  slow add and remove in center
    //использовать где нужно читать/писать, но не добавлять/удалять по середине!
    //-------------------------------------------
    LinkedList linkedList = new LinkedList<>();
    // + быстрое добавление и удаление элементов
    // - медленный доступ по индексу
    // использовать где нужно добавлять/удалять но не читать/писать по середине!

    HashSet hashSet = new HashSet<>();
    // + быстрый, - неупорядоченный
    // только уникальные значения

    TreeSet treeSet = new TreeSet<>();
    // множество с сортировкой(если строка то по алфавиту \/ если число то по возрастанию)
    // скорость от размера зависит

    LinkedHashSet linkedHashSet = new LinkedHashSet<>();
    //просто дает порядок добавления для HashSet

    public static void main(String[] args) {
        /*List<String> words = new ArrayList<>();
        words.add("w");
        words.add("a");
        words.add("d");
        System.out.println("ArrayList: " + words);

        TreeSet<String> wordsTree = new TreeSet<>(words);
        System.out.println("TreeSet: " + wordsTree);*/

        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int ss = random.nextInt(20);
            list.add(ss);
        }

        //list.removeIf(integer -> integer % 2 == 0);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        TreeSet<Integer> treeList = new TreeSet<>(list);
        System.out.println(treeList);
    }


}
