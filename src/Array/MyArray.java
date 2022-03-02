package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {
    public static void main(String[] args) {
        //new 키워드를 사용해서, 배열을 미리 선언하고, 데이터를 넣을 수도 있음
        Integer[] data_list = new Integer[10];
        data_list[0] = 1;

        System.out.println("data_list[0] = " + data_list[0]);

        //직접 배열 데이터 선언시 넣을 수도 있음
        Integer data_list1[] = {5,4,3,2,1};
        Integer[] data_lsit2 = {1,2,3,4,5};

        System.out.println("data_lsit2[0] = " + data_lsit2[0]);
        System.out.println("Arrays.toString(data_lsit2) = " + Arrays.toString(data_lsit2));

        //JAVA 에서는 기본적으로 java.util 패키지에 가변 크기의 배열을 다룰 수 있는 ArrayList 클래스도 제공하고 있음
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        System.out.println("list1.get(0) = " + list1.get(0));
        list1.set(0,5); //특정 인덱스에 해당하는 아이템 변경 시 ,set(인덱스번호, 변경할값) 메서드 사용
        System.out.println("list1.get(0) = " + list1.get(0));
        list1.remove(0); //특정 인덱스에 해당하는 아이템 삭제 시, remove(인덱스번호) 메서드 사용
        System.out.println("list1.get(0) = " + list1.get(0));
        //배열 길이 확인하기
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.size() = " + list1.get(list1.size()-1));
    }
}
