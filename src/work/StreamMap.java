package work;

import base.DataBase;
import entity.Human;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        /** �������� �������� � ����� ������ ���� �� ������ ���������� � ���� ������
         * �� ������ �������� ��������� ���������� ����� ����� � ������� ����� ������*/

        List<String> listName = new ArrayList<>();
        listName.add("Tom");
        listName.add("Semi");
        listName.add("Tokio");
        listName.add("Tarina");
        listName.add("Selena");

        //��� �������
//        for (int i = 0; i < listName.size(); i++) {
//            listName.set(i,String.valueOf(listName.get(i).length()));
//        }

        //�� �������� ������� ���� �����
        List<String> stringList = listName.stream()
                .map(name -> String.valueOf(name.length()))
                .collect(Collectors.toList());

        //�� �������� ������� ���� �����
        List<Integer> intList = listName.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        //�����
        System.out.println(listName);
        listName.stream().forEach(System.out::print);
        System.out.println();


        /**  ����� ����� �� ������� ����� ������ ������� ��������� �� �� �������� �� �� �� 3 ��� �������
         * ���� �������� ������ ���� ��������� ����� �������� �� 3 ����� �������� ������� �����
         * ����� �������� �� ������ ������*/
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


        /** �������� Set ����� � �� ������ �������� set �� Integer */
        Set<String> stringSet = new TreeSet<>(listName);
        System.out.println(stringSet);

        Set<Integer> integerSet = stringSet.stream()
                .map(element -> element.length())
                .collect(Collectors.toSet()); //��� Collectors.toList()

        System.out.println(integerSet);



        /** ������ � ��������� � ������ ��������� � ����� (������)
         * ���������� � salary (��������) ������� �� 5000 */
        List<Human> humans = DataBase.getList();
        List<Human> humanList = humans.stream()
                .map(human -> new Human(human.getName(), human.getAge(), human.getSalary() + 5000))
                .collect(Collectors.toList());

        System.out.println(humanList);
    }
}
