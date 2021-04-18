package cn.gpns.day07.Demo01;

import java.sql.SQLOutput;

/**
 * java.lang。String类代表字符串
 * API当中说：java程序中所有的字符串字面值（如”abc“）都作为此类的实现实现
 * 其实就是说：程序当中所有带双引号字符串都是String类的对象
 *
 * 字符串的特点：
 * 1.字符串的内容永不可变
 * 2.正因为字符串的不可变，所以字符串是可以共享使用的
 * 3.字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组
 *
 * 创建字符串常见的三种3+1种方式：
 * 三种构造方式：
 * public String()
 * public String(char[] array)
 * public String(byte[] array)
 * 一种直接创建
 * String str = "Holle";
 * 注意：直接写上双引号就是字符串对象。
 */

public class Demo01String {
    public static void main( String[] args ) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串="+ str1);

        //根据字符数组创建字符串
        char[] charArray = {'A' ,'B','C'};
        String str2 = new String(charArray);
        System.out.println("第2个字符串"+str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串"+str3);

        //直接创建字符串
        String str4 = "Hello World";
        System.out.println(str4);

    }



}
