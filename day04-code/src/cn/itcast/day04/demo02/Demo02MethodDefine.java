package cn.itcast.day04.demo02;

/*
方法名称：方法的名字，规则和变量的命名一样，小驼峰

方法的三种调用：
1.单独调用：方法名称（参数）
2.打印调用:
3.赋值调用
 */
public class Demo02MethodDefine {
    public static void main( String[] args ) {
        //单独调用
        sum(10,20);
        System.out.println("===========");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("===========");

        //赋值调用
        int number = sum(10,20);
        System.out.println("变量的值="+number);

    }

    public static int sum( int a, int b ) {
        return a + b;
    }

}
