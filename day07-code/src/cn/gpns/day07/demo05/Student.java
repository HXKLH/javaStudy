package cn.gpns.day07.demo05;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the value of name. *
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name. *
     * <p>You can use getName() to get the value of name</p>
     * * @param name name
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age. *
     * <p>You can use getAge() to get the value of age</p>
     * * @param age age
     */
    public void setAge( int age ) {
        this.age = age;
    }
}
