package work;

import java.util.Arrays;

public class StreamCount {
    public static void main(String[] args) {
        int [] arr2 = {6,7,8,9,10,7,8,5};

        //����������  ��������� � ������
        System.out.println(Arrays.stream(arr2).count());

        //���������� �� ������������� ��������� � ������
        System.out.println(Arrays.stream(arr2).distinct().count());

    }
}
