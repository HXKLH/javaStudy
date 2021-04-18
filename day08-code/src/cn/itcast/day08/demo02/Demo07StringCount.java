package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种出现字符的出现个数。
种类有：大写字母、小写字母、数字、其他字符
 */
public class Demo07StringCount {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }


        System.out.println("大写字母个数有：" + countUpper);
        System.out.println("小写字母个数有：" + countLower);
        System.out.println("数字个数有：" + countNumber);
        System.out.println("其他字符个数有：" + countOther);


    }
}
