package work;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMap {
    public static void main(String[] args) {
        Company company1 = new Company("Java");
        Company company2 = new Company("Kotlin");
        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);

        company1.getEmployee(new Employee("Tom", 70_000));
        company1.getEmployee(new Employee("Jesika", 170_000));
        company1.getEmployee(new Employee("Forest", 270_000));

        company2.getEmployee(new Employee("Lia", 75_000));
        company2.getEmployee(new Employee("Vadim", 110_000));
        company2.getEmployee(new Employee("Sin", 170_000));


        //без стрима вывод
        for (Company company : companies) {
            System.out.println(company.getName());
            for (Employee employee : company.employeeList) {
                System.out.println(employee);
            }
        }
        System.out.println();

        /** вывести всех сотрудников компаний указав так же название компании*/
        companies.stream().peek(c -> System.out.println(c.getName()))
                .flatMap(company -> company.employeeList.stream())
                .forEach(System.out::println);

    }
}


class Company{
    private String name;
    List<Employee> employeeList;

    public Company(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public void getEmployee(Employee employee){
        employeeList.add(employee);
    }

    public String getName() {
        return name;
    }
}


class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
