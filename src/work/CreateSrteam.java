package work;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateSrteam {
    public static void main(String[] args) {
        //через коллекции
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream1  = list.stream();
        stream1.forEach(e-> System.out.print(e + " "));
        System.out.println("\n");

        //через строку
        String text = "123";
        IntStream integerStream2 = text.chars();
        integerStream2.forEach(e -> System.out.print(e + " "));
        System.out.println("\n");

        //через массив примитивного типа IntStream помощью класса Arrays
        int [] array = {1,4,5,7,56,53,45,34};
        IntStream integerStream3  = Arrays.stream(array);
        integerStream3.forEach(e -> System.out.print(e + " "));
        System.out.println("\n");

        //через массив String с помощью класса Arrays
        String [] logins = {"q1","q2","q3","q4","q5"};
        Stream<String> stream4  = Arrays.stream(logins);
        stream4.forEach(e -> System.out.print(e + " "));
        System.out.println("\n");

        //сам стрим
        Stream<Integer> stream5  = Stream.of(1,2,2,2,7,7,7,7);
        Stream<String> stream55  = Stream.of("Hello1","Hello");
        stream55.forEach(e -> System.out.print(e + " "));
        System.out.println("\n");


        //из Файла
        Path path = Paths.get("C:\\Users\\Admin\\IdeaProjects\\StreamApi_java\\src\\text.txt");
        try {
            Stream<String> streamFile = Files.lines(path);
            streamFile.forEach(e -> System.out.print(e + " "));
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
