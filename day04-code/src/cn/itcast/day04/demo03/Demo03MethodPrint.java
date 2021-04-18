package cn.itcast.day04.demo03;
/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld.
 */
public class Demo03MethodPrint {
    public static void main( String[] args ) {
        printHelloWorld(5);
    }

    public static void printHelloWorld(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld！"+(i+1));
        }
    }

}
