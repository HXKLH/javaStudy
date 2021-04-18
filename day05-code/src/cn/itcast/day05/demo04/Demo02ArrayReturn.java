package cn.itcast.day05.demo04;

/*
一个方法可以有0、1、多个参数；但是只能有0个或者1个返回值，不能有多个返回值。
解决方案：使用一个数组作为返回值即可。

任何数据类型都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值
 */
public class Demo02ArrayReturn {
    public static void main( String[] args ) {
        int[] result = calculate(10,20,30);
        System.out.println("main方法接收到的数组是"+result);

    }

    public static int[] calculate( int a, int b, int c ) {
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数

        //两个结果的希望返回
        //需要一个数组，也就是一个塑料兜，数组可以保存多个结果
//        int[] array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
        int [] array = {sum,avg};
        System.out.println("calculate方法内部数组是："+array);
        return array;

    }


}
