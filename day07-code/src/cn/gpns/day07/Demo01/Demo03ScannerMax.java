package cn.gpns.day07.Demo01;

import java.util.Scanner;

/*
题目：键盘输入3个int,然后求出其中的最大值
 */
public class Demo03ScannerMax {
    public static void main( String[] args ) {
        int[] scanner = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        scanner[0] = sc.nextInt();
        System.out.print("请输入第二个数：");

        scanner[1] = sc.nextInt();
        System.out.print("请输入第三个数：");
        scanner[2] = sc.nextInt();

        int max = getMax(scanner);
        System.out.println("三个数中最大值是：" + max);
    }

    public static int getMax( int[] scanner ) {
        int max = scanner[0];
        for (int i = 1; i < scanner.length; i++) {
            if (scanner[i] > max) {
                max = scanner[i];
            }
        }
        return max;
    }
}
