package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {
    public static void main(String[] args) {
        /** получить из Листа чисел первое число которое подходит по условию 5 */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(6);
        integerList.add(11);

       Optional<Integer> optional =  integerList.stream().filter(n -> n > 5).findFirst();
       if (optional.isPresent()){
           System.out.println(optional.get());
       }

    }
}
