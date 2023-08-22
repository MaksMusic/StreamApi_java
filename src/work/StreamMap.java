package work;

import base.DataBase;
import entity.Human;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        /** поменять значение в листе вместо имен их длинны привденные к типу стринг
         * не меняет оригинал коллекции возвращает новую может и сдругим типом данных*/

        List<String> listName = new ArrayList<>();
        listName.add("Tom");
        listName.add("Semi");
        listName.add("Tokio");
        listName.add("Tarina");
        listName.add("Selena");

        //без стримов
//        for (int i = 0; i < listName.size(); i++) {
//            listName.set(i,String.valueOf(listName.get(i).length()));
//        }

        //со стримами вернуть лист строк
        List<String> stringList = listName.stream()
                .map(name -> String.valueOf(name.length()))
                .collect(Collectors.toList());

        //со стримами вернуть лист строк
        List<Integer> intList = listName.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        //вывод
        System.out.println(listName);
        listName.stream().forEach(System.out::print);
        System.out.println();


        /**  поток стрим из массива после каждый елемент проверить на то делиться ли он на 3 без остатка
         * если делиться вместо него поместить число деленное на 3 иначе оставить текущее число
         * после получить из стрима массив*/
        int[] array = {1, 6, 7, 5, 3, 2, 9};
        int[] array1 = Arrays.stream(array).
                map(element -> {
                    if (element % 3 == 0) {
                        return element / 3;
                    } else {
                        return element;
                    }
                }).toArray();

        System.out.println(Arrays.toString(array1));


        /** получили Set строк а на выходе получили set из Integer */
        Set<String> stringSet = new TreeSet<>(listName);
        System.out.println(stringSet);

        Set<Integer> integerSet = stringSet.stream()
                .map(element -> element.length())
                .collect(Collectors.toSet()); //или Collectors.toList()

        System.out.println(integerSet);



        /** работа с объектами а именно изменение в листе (замена)
         * добавление к salary (зарплате) каждому по 5000 */
        List<Human> humans = DataBase.getList();
        List<Human> humanList = humans.stream()
                .map(human -> new Human(human.getName(), human.getAge(), human.getSalary() + 5000))
                .collect(Collectors.toList());

        System.out.println(humanList);
    }
}
