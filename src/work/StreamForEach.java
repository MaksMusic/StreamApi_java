package work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamForEach {
    public static void main(String[] args) {

        /** получить стрим из массива и вывести каждый элемент умноженный на 2 */
        int [] array = {1,5,-7,8,54,-4,3,2};
        Arrays.stream(array).forEach(value -> {value *= 2 ;
            System.out.print(value +" ");});
        System.out.println();

        //вывод каждого элемента
        Arrays.stream(array).forEach(value -> System.out.print(value +" "));
        System.out.println();

        //ссылка на метод который будет исполнен для каждого элемента
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();

        //ссылка на свой метод который принимает число и выводит его абсолютное число
        //каждый элемент из массива будет передан в качестве параметра в этот метод
        Arrays.stream(array).forEach(new Util()::printAbsNumber);

        //если метод статический
        //Arrays.stream(array).forEach(Util()::printAbsNumber);


    }
}


class Util{
    public void printAbsNumber(int n){
        if (n < 0)
            System.out.print(n* -1 + " ");
        else
            System.out.print(n+" ");
    }
}