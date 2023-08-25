package work;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {
    public static void main(String[] args) {

        /** �������� ����� � �������� ����� ��������� ���� �����*/
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);


        int result = integerList.stream()
                .reduce( (a,e) -> a * e ).get();
        System.out.println(result);

        //��� ��������� ��������� �����
        int result2 = integerList.parallelStream()
                .reduce( (a,e) -> a * e ).get();
        System.out.println(result);



        /** ������ ����� */
        List<Double> list = new ArrayList<>();
        list.add(17.1);
        list.add(2.1);
        list.add(3.1);
        list.add(1.1);
        list.add(0.15);


        double divisionResult = list.stream()
                .reduce( (a,e) -> a / e ).get();
        System.out.println(divisionResult);

        //��� ������� ��������� ������
        double divisionResult2 = list.parallelStream()
                .reduce( (a,e) -> a / e ).get();
        System.out.println(divisionResult2);

    }
}
