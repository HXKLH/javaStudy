package cn.gpns.day07.demo03;

import java.util.Random;

/*
题目要求：
根据int变量n的值，来获取随机数字，范围是[1,n],可以取到1，也可以取到n
 */
public class Demo03Random {
    public static void main( String[] args ) {
        for (int i = 0; i < 100; i++) {
            System.out.println("取到的数是：" + getRandomInt(6));
        }
    }

    public static int getRandomInt( int n ) {
        return new Random().nextInt(n) + 1;
    }
}
