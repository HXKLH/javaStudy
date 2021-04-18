package cn.itcast.day04.demo03;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同
 */
public class Demo01MethodSame {
    public static void main( String[] args ) {
        System.out.println(isSame(12, 11));
        System.out.println("==============");
        System.out.println(isSame(14, 14));
    }

    public static boolean isSame( int a, int b ) {
        boolean same;
        //用if选择判断
      /* if (a == b) {
            same = true;
        }else{
            same = false;
        }*/

        //三目运算符
      /*same = a == b ? true : false;
        return same;*/
        //直接返回一个运算式
        return a == b;
    }


}
