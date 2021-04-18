package demo14;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager( String name, int leftMoney ) {
        super(name, leftMoney);
    }

    /**
     * 返回类型ArrayList<Integer>
     * 方法名SAND
     * 参数列表    1、总共发多少钱
     * 2、分成多少份
     */
    public ArrayList<Integer> sand( int totalMoney, int count ) {
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getLeftMoney();

        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，其实就是重新设置余额
        super.setLeftMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成count分
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        //把余数放到最后一个红包中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg +mod;
        redList.add(last);
        return redList;
    }
}
