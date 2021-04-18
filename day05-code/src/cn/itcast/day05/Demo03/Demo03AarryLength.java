package cn.itcast.day05.Demo03;

/*
如何获取数组的长度，格式：
数组名.length

这将会得到一个int的数字，代表数组的长度

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03AarryLength {
    public static void main( String[] args ) {
        //动态初始化两步走
//    int[] array1;
//    array1 = new int[3];


        //静态初始化两步走
//        int[] array2;
//        array2 = new int[]{15,25,35};


        //动态初始化
        int[] arrayA = new int[3];


        //静态初始化（省略）
        int[] arrayB = {15, 25, 35, 14, 34, 353, 35, 35, 6, 2, 1, 3, 535, 35, 6, 2, 1, 3, 5};

        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);

        System.out.println("=========");
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC = new int[5];
        System.out.println(arrayC.length);//5

    }


}

