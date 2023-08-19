import entity.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("John", 25, 50000.0));
        humans.add(new Human("Emily", 30, 60000.0));
        humans.add(new Human("Michael", 35, 70000.0));
        humans.add(new Human("Sophia", 40, 80000.0));
        humans.add(new Human("William", 45, 90000.0));
        humans.add(new Human("Olivia", 50, 100000.0));
        humans.add(new Human("James", 55, 110000.0));
        humans.add(new Human("Ava", 60, 120000.0));
        humans.add(new Human("Benjamin", 65, 130000.0));
        humans.add(new Human("Isabella", 70, 140000.0));


        /** отфильтровать и после получить терминальным методом Лист отфильтрованных */
        List<Human> humanList = humans.stream().filter(human -> human.getSalary() > 70000)
                .collect(Collectors.toList());

        humanList.forEach(System.out::println);
        System.out.println();


        /** Отсортировать лист */
        List<Human> humanListSort = humanList.stream().filter(human -> human.getSalary() > 70_000)
                .sorted()
                .collect(Collectors.toList());

        //пройтись циклом по листу и к каждому элементу применить метод (передам ссылку на метод)
        humanListSort.forEach(System.out::println);
        System.out.println();


        /** map изменить каждый объект (прибавить к зп 5000) */
        List<Human> humanListMap = humanListSort.stream()
                .map(human -> new Human(human.getName(), human.getAge(), human.getSalary() + 5000))
                .collect(Collectors.toList());


        humanListMap.forEach(human -> System.out.println(human));
        System.out.println();


        /** получить первый подходящий элемент */
        Optional<Human> humanFirst = humanListMap.stream()
                .filter(human -> human.getAge() > 30)
                .findFirst();


        //get вернет или объект Person а если его нет NoSuchElementException
        System.out.println(humanFirst.get());


        /** получить 1 рандомный подходящий элемент */
        Optional<Human> humanAny = humanListMap.stream()
                .filter(human -> human.getAge() > 30)
                .findAny();


        //get вернет или объект Person а если его нет NoSuchElementException
        System.out.println(humanAny.get());


        /** Получить количество элементов которые прошли фильтр */
        int age = 10;
        long countHumanAgeOver = humans.stream()
                .filter(human -> human.getAge() >= age)
                .count();

        System.out.println("Людей старше " + age + " " + countHumanAgeOver);

    }

}
