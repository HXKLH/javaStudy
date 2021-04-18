package cn.itcast.day08.demo03;

/*
如果一个成员变量使用的static关键字，那么这个变量不在属于兑现自己，而是属于类，多个变量共享同一份数据。
 */
public class Demo01StaticField {
    public static void main( String[] args ) {
        Student.setRoom("101教室");
        Student two = new Student("黄蓉", 16);
        System.out.println("姓名:" + two.getName() + ",年龄:" + two.getAge() + ",教室:"
                + Student.getRoom() + ",学号:" + two.getId());


        Student one = new Student("郭靖", 19);
        System.out.println("姓名:" + one.getName() + ",年龄:" + one.getAge() + ",教室:"
                + Student.getRoom() + ",学号:" + one.getId());
    }
}
