package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        //concat объединяет стрим и возвращает стрим
        //но не может быть использован в цепочке
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};

        //соединить 2 массива в 1
        Integer [] arr = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list1.add(16);
        list1.add(17);
        list1.add(18);
        list1.add(19);
        list1.add(20);
        list1.add(21);

        List<Integer> list3 = Stream.concat(list1.stream(),list2.stream()).toList();
        System.out.println(list3);

    }
}
