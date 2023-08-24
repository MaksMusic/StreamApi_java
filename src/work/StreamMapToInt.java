package work;

import base.DataBase;
import entity.Human;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToInt {
    public static void main(String[] args) {

        //   ������ ������������� mapToInt ��� �������������� ������ ����� � ������ ����� �����:

        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> intList = stringList.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(intList); // [1, 2, 3, 4, 5]




/** ����� ����� ������� ���� ����������� �������� */
//        companies ��� ���� �������� �������� �
//        � ������ ������� ���� ���� ����������� employeeList
//        double sum = companies.stream()
//                .flatMap(company -> company.employeeList.stream())
//                // ����� ��������������, ��� � ������ Employee ���� ����� getSalary() ��� ��������� ��������
//                .mapToDouble(Employee::getSalary)
//                .sum();


        List<Human> humanList = DataBase.getList();
    }
}



