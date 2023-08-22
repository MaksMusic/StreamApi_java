package work;

import base.DataBase;
import entity.Human;

import java.util.ArrayList;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(1);
        integerList.add(2);

        integerList = integerList.stream().distinct().toList();
        System.out.println(integerList);


        //с объектами
        List<Human> humans = DataBase.getList();
        System.out.println(humans.size());

        List<Human> humanList = humans.stream().distinct().toList();
        System.out.println(humanList);
        System.out.println(humanList.size());
    }
}
