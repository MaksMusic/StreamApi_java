package work;

import java.util.ArrayList;
import java.util.List;

public class StreamPeak {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(6);
        integerList.add(11);

        //подсчитать не повтор€ющие элементы и по ходу выводить их
        System.out.println(integerList.stream().distinct().peek(System.out::println).count());

        System.out.println();
        //подсчитать сумму не повтор€ющихс€ элементов и по ходу выводить их
        System.out.println(integerList.stream().distinct().peek(System.out::println).reduce((a,e)-> a += e).get() );

    }
}
