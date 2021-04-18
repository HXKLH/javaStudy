package cn.gpns.day07.Demo01;

import java.util.Scanner;

/*
键盘输入两个int数字并且求出和值
 */
public class Demo02ScannerSum {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b =scanner.nextInt();
        System.out.println("两个数字和是："+sumScanner(a,b));

    }

    public static int sumScanner( int a, int b ) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

}
