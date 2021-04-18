package cn.itcast.day05.Demo03;

public class Demo04Array {
    public static void main( String[] args ) {
        int[] array = {15, 25, 30, 40, 50, 75};

        //首先用原始的方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("=============");
        //使用循环
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
