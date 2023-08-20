package work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamForEach {
    public static void main(String[] args) {

        /** �������� ����� �� ������� � ������� ������ ������� ���������� �� 2 */
        int [] array = {1,5,-7,8,54,-4,3,2};
        Arrays.stream(array).forEach(value -> {value *= 2 ;
            System.out.print(value +" ");});
        System.out.println();

        //����� ������� ��������
        Arrays.stream(array).forEach(value -> System.out.print(value +" "));
        System.out.println();

        //������ �� ����� ������� ����� �������� ��� ������� ��������
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();

        //������ �� ���� ����� ������� ��������� ����� � ������� ��� ���������� �����
        //������ ������� �� ������� ����� ������� � �������� ��������� � ���� �����
        Arrays.stream(array).forEach(new Util()::printAbsNumber);

        //���� ����� �����������
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