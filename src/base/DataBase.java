package base;

import entity.Human;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Human> getList() {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("John", 25, 50000.0));
        humans.add(new Human("John", 25, 50000.0));
        humans.add(new Human("John", 25, 50000.0));
        humans.add(new Human("John", 25, 50000.0));
        humans.add(new Human("John", 25, 50000.0));
        humans.add(new Human("Emily", 30, 60000.0));
        humans.add(new Human("Michael", 35, 70000.0));
        humans.add(new Human("sophia", 40, 80000.0));
        humans.add(new Human("william", 45, 90000.0));
        humans.add(new Human("olivia", 50, 100000.0));
        humans.add(new Human("james", 55, 110000.0));
        humans.add(new Human("ava", 60, 120000.0));
        humans.add(new Human("Benjamin", 65, 130000.0));
        humans.add(new Human("Isabella", 47, 47000.0));
        humans.add(new Human("Samira", 30, 22000.0));
        humans.add(new Human("Lia", 37, 40000.0));

        return humans;
    }
}
