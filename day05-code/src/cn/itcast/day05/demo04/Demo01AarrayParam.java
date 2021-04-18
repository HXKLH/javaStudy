package cn.itcast.day05.demo04;
/*
数组可以作为方法的参数。
当调用方法时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。
 */
public class Demo01AarrayParam {
    public static void main( String[] args ) {
        int[] array = {10, 20, 30, 40,50};

        System.out.println(array);//地址值
        System.out.println("===============");
        printArray(array);//传递进去的就是数组的地址值
        System.out.println("=============");

        printArray(array);
        System.out.println("=============");

        printArray(array);
        System.out.println("=============");

    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
