package cn.itcast.day04.demo04;
//byte short int long float double char boolean
//String
public class Demo04OverloadPrint {
    public static void main( String[] args ) {
        myPrint("asdjkavbkja");
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(double num){
        System.out.println(num);
    }

    public static void myPrint(char num){
        System.out.println(num);
    }

    public static void myPrint(boolean num){
        System.out.println(num);
    }

    public static void myPrint(String num){
        System.out.println(num);
    }
}
