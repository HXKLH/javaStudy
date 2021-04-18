package cn.itcast.day04.demo03;

public class Demo04MethodNotice {
    public static void main( String[] args ) {
        System.out.println(getMax(10, 12));
    }

    public static int method1() {
        return 0;
    }

    public static void method2() {
        return;
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
    }

    public static int getMax( int a, int b ) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
//        return a > b ? a : b;
    }
}
