package demo14;

public class User {
    private String name;
    private int leftMoney;

    public User( String name, int leftMoney ) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney( int leftMoney ) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("我叫"+this.getName()+",我有多少钱"+this.getLeftMoney());
    }
}
