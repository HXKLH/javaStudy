package cn.gpns.day07.Demo01;

import java.util.Scanner;

/*
Scanner类的功能，可以实现键盘输入数据到程序中来。

引用类型的一般使用步骤；

1.导包
import 包路径.类名称；
如果需要使用的目标类位于当前类的同一包下，导包语句可以省略不写
只有java.lang包下的内容不需要导包，其他的包都需要import语句

2.创建
类名称 对象名 = new 类名称();

3.使用
对象名.成员方法名();

获取键盘输入的一个int数字；int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */
public class Demo01Scanner {


    public static void main( String[] args ) {
//        2、创建
//        备注：System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);
        sc.nextInt();

//        3、从键盘获取一个int数字
        int num = sc.nextInt();
        System.out.println("输入是int数字是" + num);

//        4、获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是："+ str);

    }
}
