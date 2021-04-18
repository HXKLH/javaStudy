package cn.itcast.day04.demo04;

/*
题目要求：
比较两个数是否相等参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
并在main方法中进行测试
 */
public class Demo02MethodOverloadSame {
    public static void main( String[] args ) {
        byte a = 10;
        byte b = 2;
        short c = 11;
        short d = 11;
        int e = 1;
        int f = 12;
        long g= 13;
        long h = 13;
        System.out.println(isSame(a, b));
        System.out.println(isSame(c,d));
        System.out.println(isSame(e, f));
        System.out.println(isSame(g, h));
    }

    public static boolean isSame( byte a, byte b ) {
       boolean same;
        if (a==b) {
            same = true;
        }else{
            same = false;
        }
        return same;
    }


    public static boolean isSame( int a, int b ) {
        return a == b ? true : false;
    }

    public static boolean isSame( short a, short b ) {
        return a == b;
    }

    public static boolean isSame( long a, long b ) {
        if (a==b) {
            return true;
        }else{
            return false;
        }
    }
}
