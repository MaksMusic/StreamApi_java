package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTasksTwo {
    public static void main(String[] args) {
        /** 1	Найдите сумму всех чисел в стриме, кратных 3.    */

        List<Integer> integerList = Arrays.asList(3,2,5,6,7,8,9,12,6,121,32);
        int sum = integerList.stream().filter(e -> e % 3 == 0).mapToInt(value -> value).sum();
        System.out.println(sum);

        /**2. Отсортируйте стрим строк в лексикографическом порядке. */

        List<String> stringList = Arrays.asList("Homa","Binen","Nina","Zena","Anna");
        stringList = stringList.stream().sorted((e,v) -> e.compareTo(v)).collect(Collectors.toList());
        System.out.println(stringList);


        /** 3. Преобразуйте стрим целых чисел в стрим строк, содержащих их квадратные
         корни. */

        List<Integer> listInteger = Arrays.asList(3,2,5,6,7,8,9,12,6,121,32);
        List<String> strings = listInteger.stream()
                .map(elemet -> String.valueOf(Math.sqrt(elemet)))
                .collect(Collectors.toList());

    }
}
