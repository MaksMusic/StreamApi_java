package work;

import base.DataBase;
import entity.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamChaining {
    public static void main(String[] args) {
        /** ������������� ���� �������� ������ ��������
         * ����� ������� ������� �� 3 ��������� �� 3
         * �������� ����� ���������� ����� */

        int[] arr = {4, 67, 12, 432, 23, 90, 18, 21};
        int sum = Arrays.stream(arr)
                .filter(value -> value % 2 != 0)
                .map(operand -> {
                    if (operand % 3 == 0) {
                        operand /= 3;
                    }
                    return operand;
                })
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(sum);


        /** ������� ����� � ��������� �����
         * ������������� �� �������� � ���� ���� 70000 ��������
         * ������������� �� ��������*/

        List<Human> list = DataBase.getList();
        list = list.stream()
                .map(e -> new Human(String.valueOf(e.getName().charAt(0)).toUpperCase() + e.getName().substring(1, e.getName().length()),
                        e.getAge(), e.getSalary()))
                .filter(element -> element.getSalary() > 70_000)
                .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
