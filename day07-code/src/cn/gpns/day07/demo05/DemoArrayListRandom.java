package cn.gpns.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1~33之间的随机数字，添加到集合，并且遍历集合。
 */
public class DemoArrayListRandom {
    public static void main( String[] args ) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            integers.add(random.nextInt(33) + 1);
        }

        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }
}
