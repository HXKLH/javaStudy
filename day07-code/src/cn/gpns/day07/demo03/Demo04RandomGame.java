package cn.gpns.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
题目：用代码模拟猜数字游戏
 */
public class Demo04RandomGame {
    public static void main( String[] args ) {
        int n = 100;
        System.out.println("你需要从0到"+(n-1)+"中才一个整数中猜一个数!");

        int num = getRandomNum(n);
        int gesture = gestureNum();

        while (gesture != num) {
            if (gesture > num) {
                System.out.println("你猜的数字大了！");
            } else if (gesture < num) {
                System.out.println("你猜的数小了！");
            }
            gesture = gestureNum();
        }
        System.out.println("恭喜你猜对了！游戏结束！");
    }

    public static int getRandomNum( int n ) {
        return new Random().nextInt(n);
    }

    public static int gestureNum() {
        System.out.println("你猜的数字是:");
        return new Scanner(System.in).nextInt();
    }
}
