package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSkip {
    public static void main(String[] args) {
        /** получить из Листа  лист где отсаються только числа после первых 5 */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(1);
        integerList.add(15);
        integerList.add(6);
        integerList.add(11);
        integerList.add(1);
        integerList.add(2);

        integerList = integerList.stream().
                filter(e -> e > 10)
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}

