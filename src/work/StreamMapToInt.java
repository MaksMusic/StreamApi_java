package work;

import base.DataBase;
import entity.Human;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToInt {
    public static void main(String[] args) {

        //   пример использования mapToInt для преобразования списка строк в список целых чисел:

        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> intList = stringList.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(intList); // [1, 2, 3, 4, 5]




/** найти сумму зарплат всех сотрудников компаний */
//        companies это лист объектов компаний и
//        в каждом объекте есть лист сотрудников employeeList
//        double sum = companies.stream()
//                .flatMap(company -> company.employeeList.stream())
//                // здесь предполагается, что у класса Employee есть метод getSalary() для получения зарплаты
//                .mapToDouble(Employee::getSalary)
//                .sum();


        List<Human> humanList = DataBase.getList();
    }
}



