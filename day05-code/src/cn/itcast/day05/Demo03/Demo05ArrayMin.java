package cn.itcast.day05.Demo03;

public class Demo05ArrayMin {
    public static void main( String[] args ) {
        int[] array ={5,15,30,20,10000};

        int min = array[0];//比武擂台
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("最小值是"+min);
    }
}
