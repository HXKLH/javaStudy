package demo14;

import java.util.ArrayList;
import java.util.Random;

public class Number extends User {
    public Number() {
    }

    public Number( String name, int leftMoney ) {
        super(name, leftMoney);
    }

    /**
     * 返回类型 void
     * 方法名 receive
     * 参数列表ArrayList<Integer>
     */
    public void receive ( ArrayList <Integer> list){
        //从众多红包中选一个出来给自己
        int index = new Random().nextInt(list.size());
        //从集合中删除，并且得到删除的红包给自己
        int delta = list.remove(index);
        //当前成员本来有多少钱
        int money = super.getLeftMoney();
        //加法并设置回去
        super.setLeftMoney(money+delta);

    }
}
