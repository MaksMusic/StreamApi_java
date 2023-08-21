package work;

import base.DataBase;
import entity.Human;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        List<Human> list = DataBase.getList();
        /** groupingBy */
        /** получить мап
         * где ключ возраст а значение лист Human этого возраста */
        Map<Integer, List<Human>> listMap = list.stream().collect(Collectors.groupingBy(e -> e.getAge()));

        //вывод в одну строку
        listMap.entrySet().forEach(e -> System.out.println(e));
        System.out.println();

        //вывод, где возраст и после с каждой строки Human
        listMap.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " - возраст");
            e.getValue().forEach(System.out::println);

        });


        System.out.println();
        List<Human> list2 = DataBase.getList();
        /** partitioningBy */
        /** получить мап где ключ true или false а значение лист Human  */
        /** 2 листа в мапе тех кто прошел по условию и тех кто не прошел */
        /** 2 листа в мапе тех кто у кого зп выше 50к или равно и ниже 50к */
        Map<Boolean, List<Human>> listMap2 = list2.stream().collect(Collectors.partitioningBy(e -> e.getSalary() < 50_000));
        listMap2.entrySet().forEach(System.out::println);


        /** partitioningBy */
        /** получить мап где ключ true или false а значение лист Human  */
        /** 2 листа в мапе тех кто прошел по условию и тех кто не прошел */
        /** 2 листа в мапе тех кто у кого зп выше средней или равно и ниже средней */
        System.out.println();
        // Вычисляем среднюю зарплату
        double averageSalary = list2.stream()
                .mapToDouble(Human::getSalary)
                .average()
                .orElse(0);

        System.out.println("средняя зарплата " + averageSalary);

        // Используем среднюю зарплату в partitioningBy()
        Map<Boolean, List<Human>> listMap3 = list2.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() < averageSalary));

        listMap3.entrySet().forEach(System.out::println);
    }
}
