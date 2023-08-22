package work;

import base.DataBase;
import entity.Human;

import java.util.HashMap;
import java.util.List;

public class StreamMinAndMax {
    public static void main(String[] args) {
        /** получить из стрима студента с минимальным возрастом и максимальным */

        List<Human> humanList = DataBase.getList();

        Human min = humanList.stream().
                min((e1,e2)->Integer.compare(e1.getAge(),e2.getAge())).get();

        Human max = humanList.stream().
                max((e1,e2)->Integer.compare(e1.getAge(),e2.getAge())).get();

        System.out.println(min);
        System.out.println(max);
    }
}
