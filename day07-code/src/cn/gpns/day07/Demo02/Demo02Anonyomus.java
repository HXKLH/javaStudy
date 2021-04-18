package cn.gpns.day07.Demo02;

import java.util.Scanner;

public class Demo02Anonyomus {
    public static void main( String[] args ) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象使用方式
//        int num1 = new Scanner(System.in).nextInt();
//        System.out.println("输入是：" + num1);
//        使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

//        使用匿名对象来传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num2 = sc.nextInt();
        System.out.println("输入的是:"+num2);

    }

    public static void methodParam( Scanner scanner ) {
        int num = scanner.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;

        return new Scanner(System.in);
    }
}

