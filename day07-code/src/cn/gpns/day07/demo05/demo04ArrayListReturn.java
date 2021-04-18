package cn.gpns.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存放如20个随机数字，然后筛选出其中的偶数元素，放到小集合中
要求使用自定义的方法来实现筛选

*/
public class demo04ArrayListReturn {
    public static void main( String[] args ) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(100) + 1);
        }

//        System.out.println(71%2);
        ArrayList<Integer> integers1 = ArrayListSelect(integers);
        System.out.println(integers);
        for (int i = 0; i < integers1.size(); i++) {
            System.out.println(integers1.get(i));
        }

    }

    public static ArrayList<Integer> ArrayListSelect( ArrayList<Integer> array ) {
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if (num % 2 == 0) {
                array1.add(num);
            }
        }
        return array1;
    }

}
