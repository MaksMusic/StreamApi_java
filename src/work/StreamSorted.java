package work;

import base.DataBase;
import entity.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        //���������� �����
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(6);
        integerList.add(11);

        integerList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);

        //���������� �������
        int [] array = {8,7,6,5,4,3,2,1};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));


        //���������� �������� ����� ����������
        List<Human> list = DataBase.getList();
        //�� ��������
        list = list.stream().sorted((e,v)-> Integer.compare(e.getAge(),v.getAge())).collect(Collectors.toList());
    }
}
