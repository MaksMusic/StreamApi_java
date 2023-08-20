package work;

import base.DataBase;
import entity.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {

        /** найти сумму всех чисел   */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(10);

        // accumulator - это куда сохраняются сумма чисел accumulator + element
        int result = integerList.stream()
                .reduce((accumulator, element) -> accumulator + element).get();

        //или если безопаснее
       Optional<Integer> optional = integerList.stream()
                .reduce((accumulator, element) -> accumulator + element);

       if (optional.isPresent()){
           System.out.println(optional.get());
       }else {
           System.out.println("лист пустой");
       }


        /** найти сумму всех чисел + начальное значение для accumulator */
        //не возвращает Optional
       int result2 = integerList.stream()
                .reduce(3,(accumulator, element) -> accumulator + element);

        System.out.println(result2);


        /** получить строку из элементов листа
         * где каждый элемент разделен от другого запятой */
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Nina");
        list.add("Rita");
        list.add("Daniel");
        list.add("Dina");

        String names =  list.stream().reduce((a,e) -> a+ "," + e).get();
        System.out.println(names);



    }
}
