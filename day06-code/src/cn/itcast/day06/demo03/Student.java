package cn.itcast.day06.demo03;

public class Student {
    private String name;//姓名
    private int age;//年龄
    private boolean meal;//性别



    /**
     * Gets the value of name. *
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    public boolean isMeal() {
        return meal;
    }

    public void setMeal( boolean meal ) {
        this.meal = meal;
    }

    /**
     * Sets the age. *
     * <p>You can use getAge() to get the value of age</p>
     * * @param age age
     */
    public void setAge( int age ) {
        this.age = age;
    }

    /**
     * Sets the name. *
     * <p>You can use getName() to get the value of name</p>
     * * @param name name
     */
    public void setName( String name ) {
        this.name = name;
    }
}
