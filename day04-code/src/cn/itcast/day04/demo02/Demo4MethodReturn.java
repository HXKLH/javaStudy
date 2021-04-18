package cn.itcast.day04.demo02;

/*
题目要求：定义一个方法，用来求2个数之和（你帮我算，算完之后把结果给我）
 */
public class Demo4MethodReturn {
    public static void main( String[] args ) {
        int sum = getSum(10, 20);
        System.out.println("返回值是："+sum);
        System.out.println("=======");
        printSum(13,29);

    }

    //我是一个方法，我负责两个数相加
    //我有返回值，谁调用我，我就把结果告诉谁
    public static int getSum( int a, int b ) {
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责两个数相加
    //我没有返回值，不会 把结果告诉任何人，而是我自己打印输出
    public static void printSum( int a, int b ) {
        int result = a + b;
        System.out.println("结果是："+result);
    }
}
