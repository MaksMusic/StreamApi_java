package work;

import base.DataBase;
import entity.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        /** получить из Листа чисел норвый лист где остаються только числа больше 5 */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(6);
        integerList.add(11);

        //получить лист через стрим
        List<Integer> integerList1 = integerList.stream().filter(element -> element > 5).collect(Collectors.toList());
        //вывод
        integerList1.forEach(e -> System.out.println(e + " "));


        /**  получить новый лист отфильтрованный где останутся только те чья зарплата ниже 50 000 а возраст выше 30     */
        List<Human> listHuman = DataBase.getList();
        List<Human> humanList = listHuman.stream()
                .filter(human -> human.getAge() >= 30 && human.getSalary() < 50_000)
                .collect(Collectors.toList());

        //вывод
        humanList.forEach(System.out::println);

    }
}
